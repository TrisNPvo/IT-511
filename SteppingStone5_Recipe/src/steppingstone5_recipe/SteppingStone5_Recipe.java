/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steppingstone5_recipe;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * Tristan Provost
 */
public class SteppingStone5_Recipe {
    
    // All except array list are private
    private String recipeName; // String initiated for recipe name
    
    private int servings; // int initiated for servings
    
    ArrayList<String> recipeIngredients = new ArrayList(); // Array list initialied for ingredients
    
    private int totalRecipeCalories; // double initiated for total calories in a recipe
    
    // Adding in mutators and accessors
    // Setting recipe name
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    // Getting recipe name
    public String getRecipeName() {
        return recipeName;
    }
    //Setting Servings
    public void setServings(int servings) {
        this.servings = servings;
    }
    // Getting servings
    public int getServings() {
        return servings;
    }
    // Calling array list of ingredients (set)
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
    // Getting recipe ingredients from array list
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }
    // setting total recipe calories
    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    // getting total recipe calories
    public int getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0; // Changed to 0
        this.recipeIngredients = new ArrayList<String>(); // Initiating the array list
        this.totalRecipeCalories = 0;
        
    }
    
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) { // Changed appropriate data types
        
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients; // Added semi colon
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {
        
        int singleServingCalories = (totalRecipeCalories / servings); // Dividing total calories by servings to get single serving calories
        
        System.out.println("Recipe: " + recipeName); // prints recipe name
        System.out.println("Serves: " + servings); // prints servings
        System.out.println("Ingredients: "); // prints ingredients
        
        for (int i =0; i < recipeIngredients.size(); i++) {
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }
        
        System.out.println("Each servings has " + singleServingCalories + " Calories.");
    }
    
    
    public SteppingStone5_Recipe createNewRecipe() {
        
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        // Data type correction for scanner initiation
        int servings = scnr.nextInt();
        
                
        do {
            
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();
            
            if (ingredientName.toLowerCase().equals("end")) {
                
                addMoreIngredients = false;
                break;
            } 
            else {
                
                recipeIngredients.add(ingredientName);
                addMoreIngredients = true;
        
                System.out.println("Please enter the ingredient amount: ");
                int ingredientAmount = scnr.nextInt(); // changed to int for equation
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                totalRecipeCalories = (ingredientCalories * ingredientAmount); // Adding equation for proper calculation
            
            }
           
       } 
        while (addMoreIngredients == true);
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, getServings(), recipeIngredients, getTotalRecipeCalories());
        recipe1.printRecipe();
        return null;
      
    }
}