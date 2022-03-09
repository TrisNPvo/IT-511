/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steppingstone2_ingredientcalculator;

import java.util.Scanner; /* Importing Java Scanner*/
/**
 *
 * @author Tristan Provost
 */
public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nameOfIngredient = ""; /* nameofIngredient initialized to a String */
        double numberCups = 0; /* numberCups initialized to a double rather than int to account for halves/quaters/etc */
        int numberCaloriesPerCup = 0; /* numberofCaloriesPerCup initialized to int */
        double totalCalories = 0; /* totalCalories initialized to double */
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();
        
        System.out.println("Please enter the number of cups of " + nameOfIngredient + " we'll need: ");
        numberCups = scnr.nextFloat();
        
        System.out.println("Please enter the name of calories per cup: ");
        numberCaloriesPerCup = scnr.nextInt();
        
        totalCalories = numberCups * numberCaloriesPerCup; /* Creating expression for totalCalories */
        
        System.out.println(nameOfIngredient + " uses " + numberCups + " cups and has " + totalCalories + " calories.");
    }
    
}
