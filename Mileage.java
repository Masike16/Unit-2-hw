/**
*Student Name: Masike Rasenyalo
* Student Number: ST10452404
*/
package mileage;

import java.util.Scanner;


public class Mileage {

   
    public static void main(String[] args) {
        double milesDriven = 0;
        double gallonsUsed;
        double milesPerGallon;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program will calculte gas mileage.");
        System.out.println("Enter the gallons used: ");
        gallonsUsed = scanner.nextDouble();
        milesPerGallon = milesDriven/gallonsUsed;
        System.out.println("Miles per gallon: " + milesPerGallon);
        scanner.close();
        
        
        
    }
    
}
