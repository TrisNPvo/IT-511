/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steppingstone3_branches;

import java.util.Scanner; /* Importing Java Scanner*/

/**
 *
 * @author Tristan Provost
 * 
 * Code Reflection: 
 * The purpose of this portion of code is implementing a nested loop for when the user
 * adds cups to the recipe. MAX_CUPS is a constant variable that will ensure that any
 * input by the user is no more than 100. The loops ensure that the input stays anywhere
 * between 1 and 100 without going over or below. 
 * 
 */
public class SteppingStone3_Branches {

    
    public static void main(String[] args) {
       int numberCups = -1;
       int MAX_CUPS = 100; /* Int value initiated for MAX_CUPS */
       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the number of cups (between 1 and 100): ");
       
       //The following "if branch" uses the scanner method hasNextInt() to
       //check to see if the input is an int.
       if (scnr.hasNextInt()) {
           numberCups = scnr.nextInt();
            /* Implemented nested loop for MAX_CUPS */
            /* numberCups is less than or equal to the MAX_CUPS if user input is valid; output initiated */
           if (numberCups <= MAX_CUPS) {
               System.out.println(numberCups + " is a valid number of cups!");
           }
           /* If user does not enter valid number (over 100 or under 1) output is initiated for user to try again. */
           else {
               System.out.println(numberCups + " is not a valid number of cups!");
               System.out.println("Please enter another number of cups between 1 and 100: ");
               numberCups = scnr.nextInt();
           }
           /* Second attempt for user input; If correct, output initiated */
           if (numberCups <= MAX_CUPS) {
               System.out.println(numberCups + " is a valid number of cups!");
           }
           /* If numberCups is less than 1, output initiated */ 
           else if (numberCups < 1) {
               System.out.println(numberCups + " is less than 1. Sorry you are out of attempts.");
           }
           /* If output is greater than 100; output initiated */
           else {
               System.out.println(numberCups + "is greater than 100. Sorry you are out of attempts.");
           } 
           }
       /* Output initiated if user enters anything but a number */
        else {
           System.out.println("Error: That is not a number. Try again.");
       }
    }
}
