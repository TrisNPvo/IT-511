


import java.util.Scanner; // Importing scanner ability

/**
 *
 * @author Tristan Provost
 * 
 * SUMMARY: This code is the ingredient class that will be associated with RecipeManger code. 
 * The use can input the quantity of ingredients along with their associated calories (plus
 * per unit calories. 
 */
class ingredientInstance {
    
    // Defining instance variables that can only be declared if methods of this class access them.
    private String nameOfIngredients;
    private String unitOfMeasurement;
    private float amountIngredient;
    private int numCaloriesPerUnit;
    private double totalCalories; 
}

    public class Ingredient {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in); // Initializing new scanner
        Ingredient newIngredient = new Ingredient(); // Creating new ingredients class
        
        //Variables defined
        String nameOfIngredient = ""; // name of ingredient defined as string
        String unitOfMeasurement = ""; // unit of measurement as string
        float amountIngredient = 0; // Amount of ingredient input as float
        int numCaloriesPerUnit = 0; // number of calories per unit
        double totalCalories = 0.0; // number of caloires intialized to a double
        
        //User input for name of ingredient 
        System.out.println("Please enter ingredient name: ");
            //Scanner for user input of ingredient name 
            nameOfIngredient = scnr.nextLine();
            
        // User input for measurement type
        System.out.println("Please enter the measurement type based on the options below: ");
        System.out.println("Cup(s)");
        System.out.println("Tbsp(s)");
        System.out.println("Tsp(s)");
        System.out.println("Pint(s)");
        System.out.println("Liter(s)");
        System.out.println("Gallon(s)");
        
        if (scnr.hasNext()) {
            unitOfMeasurement = scnr.next();
            
            // Prompt for user to enter measurement options
            if (!"Gallon(s)".equals(unitOfMeasurement) && !"Liter(s)".equals(unitOfMeasurement) && !"Pint(s)".equals(unitOfMeasurement) && !"Tsp(s)".equals(unitOfMeasurement) && !"Tbsp(s)".equals(unitOfMeasurement) && !"Cup(s)".equals(unitOfMeasurement)) {
                System.out.println("Please enter one of the options given.");
            }
            
            else {
                System.out.println("You selected: " + unitOfMeasurement);
            }
        }
        
        else {
            System.out.println("Please enter one of the options given.");
            
            if (scnr.hasNext()) {
                unitOfMeasurement = scnr.next();
                
                if (!"Gallon(s)".equals(unitOfMeasurement) && !"Liter(s)".equals(unitOfMeasurement) && !"Pint(s)".equals(unitOfMeasurement) && !"Tsp(s)".equals(unitOfMeasurement) && !"Tbsp(s)".equals(unitOfMeasurement) && !"Cup(s)".equals(unitOfMeasurement)) {
                    System.out.println("Measurement type not recognized/ You are out of attempts.");
                }
                
                else {
                    System.out.println("You selected: " + unitOfMeasurement);
                }
            }
        }
        
        // Asks user for amount of ingredients
        System.out.println("Please enter the amount of " + unitOfMeasurement + " of " + nameOfIngredient + " needed (between 1 and 100)");
        
        if (scnr.hasNextInt()) {
            amountIngredient = scnr.nextInt();
				
            if ((amountIngredient >= 1) && (amountIngredient <= 1000)) {
		System.out.println(amountIngredient + " is a valid amount. Any recipes using this " + "ingredient will require " + amountIngredient + " " + unitOfMeasurement + " of " + nameOfIngredient); 	
            }	
            
            else {
		System.out.println(amountIngredient + " is not a valid amount.");
		System.out.println("Please enter a valid number of units between 1 and 1000: ");
                    if (scnr.hasNextInt()) {
                        amountIngredient = scnr.nextInt();
				
                        if ((amountIngredient >= 1) && (amountIngredient <= 1000)) {
                            System.out.println(amountIngredient + " is a valid amount!"); 	
                        }
                        
                        else if (amountIngredient < 1) {
                            System.out.println(amountIngredient + " is less than 1 unit. Sorry, you are out of attempts.");
                        }
                        
                        else {
                            System.out.println(amountIngredient+ " is greater than 1000 units. Sorry, you are out of attempts.");
                        }
            }
        }
    }
        
    else {
        System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
	}
	
        // Asks user for calories input
        System.out.println("Please enter the number of calories per " + unitOfMeasurement + " of " + nameOfIngredient + " (between 1 and 2000): ");
        
    if (scnr.hasNextInt()) {
        numCaloriesPerUnit = scnr.nextInt();
			
        if ((numCaloriesPerUnit >= 1) && (numCaloriesPerUnit <= 2000)) {
            System.out.println(numCaloriesPerUnit + " is a valid number of calories."); 	
        }
        else {
            System.out.println(numCaloriesPerUnit + " is not a valid number of calories.");
            System.out.println("Please enter a valid number of calories per unit between 1 and 2000: ");
            
            if (scnr.hasNextInt()) {
                numCaloriesPerUnit = scnr.nextInt();
                // Initializing the number of calories inputted needs to be less than or equal to 2000
                if ((numCaloriesPerUnit >= 1) && (numCaloriesPerUnit <= 2000)) {
                    System.out.println(numCaloriesPerUnit + " is a valid number of calories!"); 	
                }
                
                // Prompts user to know that the number is less than one for calories
                else if (numCaloriesPerUnit < 1) {
                    System.out.println(numCaloriesPerUnit + " is less than 1. Sorry, you are out of attempts.");
                }
                
                // Prompts user to know that thier number is greater than 2000
                else {
                    System.out.println(numCaloriesPerUnit + " is greater than 2000. You are out of attempts.");
                }
            }
        }
    }
    
    else {
        System.out.println("Error: That is not a number. You are out of attempts.");
        }
    

        // Calculates the total number of calories based on the amount of ingredients input
        totalCalories = amountIngredient * numCaloriesPerUnit;
        
        // Ensures user knows the ingredient was added
        System.out.println("Success!");
        System.out.println("Any recipe that uses " + nameOfIngredient + " will use " + amountIngredient + " number of " + 
                unitOfMeasurement + " of " + amountIngredient + " which contains " + totalCalories + " total calories.");
	
        // Lets user know the ingredient was added successfully to recipe box
        System.out.println("Ingredient has been added to recipe box successfully.");
        
           }
    }