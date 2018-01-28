import java.util.Scanner;

public class RPNCalculator {

	private Stack stackOne;
	
	/**
	 * Get the stack ready for use
	 * 
	 * @param none
	 * @return none
	 */
	
	public void initialiseStack(){
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
    	Scanner scanner1 = new Scanner(System.in);
    	System.out.println(userPrompt);
    	String userInput = scanner1.nextLine();
    	scanner1.close();
		return userInput;
    }
	
	/**
	 * Convert the string given by the user
	 * 
	 * @param user input string, delimiter to break string
	 * @return the final array containing the data
	 */
	
	public String[] convertString(String userInput,String delimiter) {
		String [] arrayOfInput;
		
		arrayOfInput = userInput.split(delimiter);
		
		return arrayOfInput;
	}
	
	/**
	 * Process the user input and produce the final answer
	 * 
	 * @param none
	 * @return none
	 */
	
	public void processString() {
		
		String userInput = getString("Please enter the RPN Calculation to be solved :");
		String delimiter = ",";
		String [] arrayOfInput = convertString(userInput,delimiter);
		int result = 0;
		int number1;
		int number2;
	
		for(int index = 0; index < arrayOfInput.length; index++) {
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
				result = number1 - number2;
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
		
		int finalResult = stackOne.pop();
		
		System.out.println("The final result from the calculation is : " + finalResult);
	}
	
	public void displayStack() {
		stackOne.displayStack();
	}
}
