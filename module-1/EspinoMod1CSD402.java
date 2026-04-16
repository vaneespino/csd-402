//Vanessa Espino Module 1.3
//Create a program that calculates the energy needed to heat water
package com.mycompany.espino.mod1.csd402;

/**
 *
 * @author Vanessa
 */
import java.util.Scanner;

public class EspinoMod1CSD402 {

    public static void main(String[] args){ 
        //Creat Scanner object for input
        Scanner input = new Scanner(System.in);
        
        //Define Variable
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double energyNeeded;
        
        //User input
  
    System.out.print ("Enter the water in kilograms: ");
    waterMass = input.nextDouble();
    
    System.out.print ("Enter Initial Temperature (Celsius): ");
    initialTemperature = input.nextDouble();
    
    System.out.print ("Enter Final Temperature (Celsius): ");
    finalTemperature = input.nextDouble();
    
    //Calculate formula
    energyNeeded = waterMass * (finalTemperature - initialTemperature) * 4184 ;
    
    //Output result
    System.out.println("The amount of energy needed is " + energyNeeded + " Joules");
    
    input.close();
            
    }
}
