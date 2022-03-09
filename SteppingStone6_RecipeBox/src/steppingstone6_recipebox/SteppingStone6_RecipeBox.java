/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steppingstone6_recipebox;

/**
 *
 * @author Tristan Provost
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SteppingStone6_RecipeBox {

    // Instance variables fpr arrayList list of Recipes
    private ArrayList<SteppingStone6_RecipeBox> listOfRecipes = new ArrayList();

    // Mutator of listOfRecipes
    public void setListOfRecipes(ArrayList<SteppingStone6_RecipeBox> listOfRecipes) {

        this.listOfRecipes = listOfRecipes;
    }

    // Accessor of listOfRecipes
    public ArrayList<SteppingStone6_RecipeBox> getListOfRecipes() {

        return listOfRecipes;
    }

    // Initial Constructor
    public void SteppingStone6_RecipeBox() {
        this.listOfRecipes = new ArrayList<SteppingStone6_RecipeBox>();
    }

    // Overloaded Constructor
    public void SteppingStone6_RecipeBox(ArrayList<SteppingStone6_RecipeBox> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    /**
     * Add the following custom methods:
     *
     * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe) This
     * method should accept a recipe from the listOfRecipes ArrayList recipeName
     * and use the SteppingStone5_Recipe.printRecipe() method to print the
     * recipe
     *
     * //printAllRecipeNames() <-- This method should print just the recipe
     * names of each of the recipes in the listOfRecipes ArrayList
     *
     * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
     * the SteppingStone5_Recipe.addRecipe() method to add a new
     * SteppingStone5_Recipe to the listOfRecipes
     *
     */
    public void printAllRecipeDetails() {
        SteppingStone5_Recipe tempRecipe = new SteppingStone5_Recipe();
        int i = 0;

        for (i = 0; i < listOfRecipes.size(); i++) {
            tempRecipe.printRecipe();
        }
    }

    public void printAllRecipeNames() {

        int i = 0;

        for (i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }
    }

    public void addNewRecipe() {
        SteppingStone5_Recipe tempRecipe2 = new SteppingStone5_Recipe();
        tempRecipe2.addNewRecipe();
    }

    /**
     * A variation of following menu method should be used as the actual main
     * once you are ready to submit your final application. For this submission
     * and for using it to do stand-alone tests, replace the public void menu()
     * with the standard public static main(String[] args) method
     *
     */
    public void menu() {
        // Create a Recipe Box

        //SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);

        /**
         * Print a menu for the user to select one of the three options:
         *
         */
        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();

            /**
             * The code below has two variations: 1. Code used with the
             * SteppingStone6_RecipeBox_tester. 2. Code used with the public
             * static main() method
             *
             * One of the sections should be commented out depending on the use.
             */
            /**
             * This could should remain uncommented when using the
             * SteppingStone6_RecipeBox_tester.
             *
             * Comment out this section when using the public static main()
             * method
             */
            if (input == 1) {
                
                addNewRecipe(); 
            } 
            
            else if (input == 2) {
                
                System.out.println("Which recipe?\n");
                
                String selectedRecipeName = menuScnr.next();
                
                printAllRecipeDetails(selectedRecipeName);
            } 
            
            else if (input == 3) {

                for (int j = 0; j < listOfRecipes.size(); j++) {
                    System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName());
                }
            } 
            
            else {
                
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }

            /**
             * This could should be uncommented when using the public static
             * main() method
             *
             * Comment out this section when using the
             * SteppingStone6_RecipeBox_tester.
             *
             *
             *
             * if (input == 1) { myRecipeBox.newRecipe(); } else if (input == 2)
             * { System.out.println("Which recipe?\n"); String
             * selectedRecipeName = menuScnr.next();
             * myRecipesBox.printAllRecipeDetails(selectedRecipeName); } else if
             * (input == 3) { for (int j = 0; j <
             * myRecipesBox.listOfRecipes.size(); j++) { System.out.println((j +
             * 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName()); }
             * } else { System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2.
             * Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease
             * select a menu item:"); }
             *
             *
             */
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        }

    }

}


/**
 * 
 * Final Project Details:
 * 
 * For your final project submission, you should add a menu item and a method 
 *		to access the custom method you developed for the Recipe class 
 * 		based on the Stepping Stone 5 Lab.
 *
 */
