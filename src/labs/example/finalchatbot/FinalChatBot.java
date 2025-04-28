//Ethan Bradshaw
//Java
import java.net.URI;
import java.net.URISyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FinalChatBot {

    private static final String GEMINI_API_URL = "https://api.gemini.com/v1/chat";  // Replace with actual Gemini API URL

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean isRunning = true;  // Control flag for the conversation loop
        
        // Start the conversation loop
        while (isRunning) {
            // Prompt user for input
            System.out.print("You: ");
            userInput = scanner.nextLine();
            
            // Check if the user wants to exit the conversation
            if (userInput.equalsIgnoreCase("exit")) {
                isRunning = false;  // Set the flag to false to end the loop
                System.out.println("Goodbye!");
            } else {
                // Send the user input to the Gemini API and get the response
                String response = getGeminiResponse(userInput);
                
                // Display the response from Gemini
                System.out.println("Gemini: " + response);
            }
        }
        
        scanner.close();  // Close the scanner after the loop ends
    }
    
    private static String getGeminiResponse(String userInput) throws IOException {
        HttpURLConnection connection = null;
        String response = "";
        
        try {
            // Create URL object from the URI string
            URL url = new URL(GEMINI_API_URL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            
            // Prepare JSON payload (adjust based on Gemini's API requirements)
            String jsonPayload = "{\"input\": \"" + userInput + "\"}";  // Example payload, adjust as needed
            
            // Send the request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            
            // Get the response code
            int responseCode = connection.getResponseCode();
            
            // Read the response if the request was successful
            if (responseCode == HttpURLConnection.HTTP_OK) { // 200 OK
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String inputLine;
                    StringBuilder responseBuilder = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        responseBuilder.append(inputLine);
                    }
                    response = parseGeminiResponse(responseBuilder.toString());
                }
            } else {
                response = "Error: Unable to get a valid response from Gemini.";
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        
        return response;
    }

    // Simple method to extract text from Gemini's JSON response (example parsing)
    private static String parseGeminiResponse(String jsonResponse) {
        // Assuming the response is something like: {"response": "Hello, how can I help?"}
        String responseText = "";
        try {
            int startIndex = jsonResponse.indexOf("\"response\":") + 12;  // Adjust for actual key in the response
            int endIndex = jsonResponse.indexOf("\"", startIndex);
            responseText = jsonResponse.substring(startIndex, endIndex);
        } catch (Exception e) {
            responseText = "Error parsing the response.";
        }
        return responseText;
    }
}