//Author: Ethan Bradshaw
//Date: February 10th 2024
//Purpose: to print physics classes

package labs.example.physics;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Physics physics = new Physics(); //creating the new object

        System.out.println( "Your distance is: " +physics.getDistance(55, 1) + " miles.");
        System.out.println("Your Velocity is: " + physics.getVelocity(35, 7) + " mph.");
        System.out.println("Your Momentum is: " + physics.getMomentum(0.46, 299792458) + " kg m/s"); //human moving at the speed of light :)
        System.out.println("Your Force is: " + physics.getForce(180, 7890) + " kg m/s^2"); //enjoy friction
        System.out.println("Your Work is: " + physics.getWork(800, 2000) + " Joules"); 
        System.out.println("Your Kinetic Energy: "+ physics.getKineticEnergy(0.46,3001)+ " Joule"); //Hampter go Boom
        System.out.println("Your Potential Energy: "+ physics.getPotentialEnergy(0.46,10000) + " Joule"); //Hampter like terminal velocity from space

    }
}
