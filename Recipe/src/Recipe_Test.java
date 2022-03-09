/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import recipebox.Recipe;

/**
 *
 * @author Tristan Provost
 */
public class Recipe_Test {
    
    public static void main(String[] args) {
        
        final Recipe newRecipe = new Recipe(); // Constructor; calls other class to create recipe
        
        Recipe createNewRecipe = newRecipe.createNewRecipe();  // Initiate addNewRecipe
        
        newRecipe.printRecipe(); // To print recipe
    }
    
}
