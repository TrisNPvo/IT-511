package SteppingStone4_Loops;

/*
 * Author: Tristan Provost 
 *
 * Summary: The purpose of this code is to illustarte loops within the ingredient 
 * list. OUTER loop used so that it's more organized when breaking out of loop.
 * The loops are to prompt user to input ingredients and either add more after the
 * initial input or break out of it completely.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class SteppingStone4_Loops {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String recipeName = "";
        ArrayList<String> ingredientList = new ArrayList();
        String newIngredient = "";
        boolean addMoreIngredients = true;
        

        System.out.println("Please enter the recipe name: ");
        recipeName = scnr.nextLine();
        System.out.println("You have entered: " + recipeName);

        OUTERLOOP:
        do {
            System.out.println("Would you like to enter an ingredient: (y or n)");
            String reply = scnr.next().toLowerCase();

            // Implementing switch method
            switch (reply) {

                // Case for when user types 'y'
                case "y":
                    System.out.println("Enter ingredient name: "); // Asks for ingredient name
                    ingredientList.add(scnr.next());
                    

                // Case for when user types 'n'
                case "n":
                    break OUTERLOOP;

                default:
                    System.out.println("Enter either y or n for input"); // Asks for initial input
                    break;
            }

            System.out.println("Would you like to add another ingredient? Choose y or n: ");
            String reply2 = scnr.next().toLowerCase();
            switch (reply2) {

                case "y":
                    addMoreIngredients = true; // If user inputs 'y', it reinitializes the loop
                    

                case "n":
                    addMoreIngredients = false; // If user inputs 'n', it breaks the loop
                    break OUTERLOOP;

                default:
                    addMoreIngredients = false; // If user does have a valid input, it breaks he loop
                    break OUTERLOOP;
            }

        } while (addMoreIngredients = true);

        for (int i = 0; i < ingredientList.size(); i++) {
            // Added ingredientList.get(i);
            String ingredient = ingredientList.get(i);
            System.out.println(ingredient);
        }
    }
}
