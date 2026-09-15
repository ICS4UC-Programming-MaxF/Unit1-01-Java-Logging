/**
* This program calculates the maximum number of maple wood logs a logging truck 
* can carry based on a user-specified log length. Maple wood weighs 20 kg/m, 
* and the truck has a strict weight capacity limit of 1,100 kg. The truck 
* can only carry one uniform length type per trip.
* @author  MF-ROB
* @version 1.0
* @since   2026-15-09
*/

//java imports
import java.util.InputMismatchException;
import java.util.Scanner;

// Class Declaration
public class Logging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declaration of the scanner
        // Asks for user input of the length of the maple log
        System.out.print("Please enter the length of the maple log in meters. ");
        System.out.print("Note that the length can only be 0.25 0.5 or 1 meter. Only: ");
        try {
            double length = sc.nextDouble();
            if (length < 0) { // this if statement checks if the user entered a negative number
                System.out.println("Error: Length cannot be negative.");
            } else if (length == 0) { // this if statement checks if the user entered 0
                System.out.println("The logs length cannot be 0");
            } else { // this else statement checks if the user entered a valid length
                if (length == 0.25 || length == 0.5 || length == 1) {
                    double weightPerLog = 20 * length; // calculates the weight of one log based on the user input
                    double maxLogs = 1100 / weightPerLog; // calculates the maximum number of logs the truck can carry
                    System.out.println("The maximum number of logs the truck can carry is: " + (int) maxLogs);
                } else { // this else statement checks if the user entered an invalid length
                    System.out.println("Error: Length must be either 0.25, 0.5, or 1 meter.");
                }
                }
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for the length.");
            } finally {
            sc.close();
        }
    }
}