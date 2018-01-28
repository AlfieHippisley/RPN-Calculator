/**
 * Tester class for running tests on the other classes
 * 
 * @author Alfie Hippisley
 * @version 28/01/2018
 */

public class Tester {
	
	// Instance Variables
	private Stack stackOne;
	private RPNCalculator rpn1;
	
	/**
	 * Get stack ready
	 * 
	 * @param none
	 * @return none
	 */
	
	public void initaliseStack() {
		stackOne = new Stack();
	}
	
	/**
	 * Get rpn ready
	 * 
	 * @param none
	 * @return none
	 */
	
	public void initaliseRPNCalc() {
		rpn1 = new RPNCalculator();
	}
	
	/**
	 * Test the stack is working as expected via pop, push and check empty and display
	 * 
	 * @param none
	 * @return none
	 */
	
	public void automatedStackTest() {
		
		// Add 1 , display the addition
		stackOne.push(1);
		stackOne.displayStack();
		
		// Add 2 , display the addition 
		stackOne.push(2);
		stackOne.displayStack();
		
		// Add 3 , display the addition
		stackOne.push(3);
		stackOne.displayStack();
		
		// Check empty stack detection
		stackOne.isStackEmpty();
		
		// Remove 3 , display the removal
		stackOne.displayStack();
		stackOne.pop();
		
		// Remove 2 , display the removal
		stackOne.displayStack();
		stackOne.pop();
	
		// Remove 1 , display the removal
		stackOne.displayStack();
		stackOne.pop();
		
		// Check empty stack detection
		stackOne.isStackEmpty();	
	}
	
	/**
	 * Test that the RPN calculator works as expected
	 * 
	 * @param none
	 * @return none
	 */
	
	public void automatedRPNTest() {
		
		// Run the RPN tests
		rpn1.initialiseStack();
		rpn1.processString();
		rpn1.displayStack();
	}
	
	/**
	 * Main method for running the testing
	 * 
	 * @param args
	 */

	//public static void main(String[] args) {
	//	Tester test = new Tester();
		
	//	test.initaliseRPNCalc();
	//	test.automatedRPNTest();
		
	//}
}
