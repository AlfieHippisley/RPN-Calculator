import java.util.Scanner;

public class RPNCalculator {

	// Instance variable
	private Stack stackOne;
	
	/**
	 * Get the stack ready for use
	 * 
	 * @param none
	 * @return none
	 */
	
	public void initialiseStack(){
		// New stack object
		stackOne = new Stack();
	}
	
	/**
	 * Get the string from the user
	 * 
	 * @param message to be prompt the user for input
	 * @return user input
	 */
	
	public String getString(String userPrompt)
    {
		// Open new scanner object
    	Scanner scanner1 = new Scanner(System.in);
    	
    	// Show user prompt
    	System.out.println(userPrompt);
    	
    	// Get user input
    	String userInput = scanner1.nextLine();
    	
    	// Return the user input
		return userInput;
    }
	
	/**
	 * Convert the string given by the user
	 * 
	 * @param user input string, delimiter to break string
	 * @return the final array containing the data
	 */
	
	public String[] convertString(String userInput,String delimiter) {
		
		// Create array
		String [] arrayOfInput;
		
		// Fill the array with the contents from the spilt string
		arrayOfInput = userInput.split(delimiter);
		
		// Return the array filled with the split contents
		return arrayOfInput;
	}
	
	/**
	 * Process the user input and produce the final answer
	 * 
	 * @param none
	 * @return none
	 */
	
	public void processString() {
		
		// Header to separate calculations from menu
		System.out.println("--------------------------------------------------------------------------------");
		
		// Send user prompt to 'getString' and store the response as 'userInput'
		String userInput = getString("Please enter the RPN Calculation to be solved :");
	
		// Set what will be used to split the string
		String delimiter = ",";
		
		// Set fill the array via 'converString' passing the user input and the delimiter
		String [] arrayOfInput = convertString(userInput,delimiter);
		
		
		int result = 0; // Store result
		int number1;	// Store the first number pop
		int number2;	// Store the second number pop
	
		// Loop for all tokens in array
		for(int index = 0; index < arrayOfInput.length; index++) {
			
			// Check if number or operator
			if(arrayOfInput[index].equals("+")){
				// Get numbers
				number1 = stackOne.pop();
				number2 = stackOne.pop();
				
				// Perform calculation
				result = number1 + number2;
				stackOne.push(result);
			}
			
			else if(arrayOfInput[index].equals("-")){
				// Get numbers
				number1 = stackOne.pop();
				number2 = stackOne.pop();
				
				// Perform calculation
				result = number2 - number1;
				stackOne.push(result);
			}
			
			else if(arrayOfInput[index].equals("*")){
				// Get numbers
				number1 = stackOne.pop();
				number2 = stackOne.pop();
				
				// Perform calculation
				result = number1 * number2;
				stackOne.push(result);
			}
			
			else {
				// Must be a number assuming a valid input
				// TODO Validate this input
				int number = Integer.parseInt(arrayOfInput[index]);
				stackOne.push(number);
			}

		}
		
		// Store the final result
		int finalResult = stackOne.pop();
		
		// Show the final result
		System.out.println("The final result from the calculation is : " + finalResult);
	}
	
	public void displayStack() {
		// Testing purposes, show stack
		stackOne.displayStack();
	}
}
