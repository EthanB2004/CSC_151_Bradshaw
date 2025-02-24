//Author: Ethan Bradshaw
//Date: February 10th 2024
//Purpose: to make a useful gravity program 

package labs.example.physics;
import java.lang.Math;

public class Physics{
    double lightSpeedMPH = (186282 * 60) * 60;
    double knownDistanceToEarth = 92947266.72;

    public double getLightSpeed(){
        return lightSpeedMPH;
    }

    public double getTimeFromSunToEarthInHours(){
       double timeFromSun;
       timeFromSun = knownDistanceToEarth / lightSpeedMPH;
       return timeFromSun;
    }
    final static double GRAVITY = 9.81;
    public void Physics(){
        //constructor
    }

    public double getDistance(double v, double t){
        double x;
        x = v*t;
        return x;

    }

    public double getVelocity(double x, double t){
        double v;
        v = x/t;
        return v;

    }

    public double getMomentum(double m, double v){
        double p;
        p = m*v;
        return p;

    }

    public double getForce(double m, double a){
        double f;
        f = m*a;
       return f;

    }

    public double getWork(double f, double d){
        double w;
        w = f*d;
        return w;

    }

    public double getKineticEnergy(double m, double v){
         double ke;
        ke = (1/2)*m*(v*v);
        return ke;

    }

    public double getPotentialEnergy(double m, double h){
        double pe;
        pe = m*GRAVITY*h;
        return pe;

    }
    public double getTheta(double leg1, double leg2){
        //double miles = 0;
        double angle = 0;
        //System.out.println("The" + this.name + " is going for a Walk It is headed South"); //Dog be walking
        
        //System.out.println("The " +this.name+ " is now headed east, after walking 3 miles.");
        
        //System.out.println("The " +this.name+ " is now coming back, after walking 4 miles");
        ///Doing the maths 

       // miles = Math.pow(3,2) + Math.pow(4,2);
        //miles = Math.sqrt(miles);
        angle = Math.atan2(leg1, leg2);
        //System.out.println("The "+this.name+ " is now home after walking " +miles+ );
        Double angleInDegrees = Math.toDegrees(angle);
        return angleInDegrees;
    }
    public void logInvalidAngleInfo(double angle){
        System.out.println("logging the angle " + String.format("%.2f",angle) + " degrees. This is not a right angle.");
    }
    public void logValidInfo(double angle){
        System.out.println("Logging the angle " + String.format("%.2f",angle) + " degrees. This is a valid 3-4-5 triangle");
    }
    public void logEarthToSunInvalidDistance(){
        System.out.println("Distance to the sun is invalid");
    }

        public Double getKnownDistanceToEarth(){
        
            return knownDistanceToEarth;
        }
    
}