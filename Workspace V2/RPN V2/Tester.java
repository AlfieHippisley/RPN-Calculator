
public class Tester {
	
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
		
		
		stackOne.push(1);
		stackOne.displayStack();
		
		stackOne.push(2);
		stackOne.displayStack();
		
		stackOne.push(3);
		stackOne.displayStack();
		
		stackOne.isStackEmpty();
		
		stackOne.displayStack();
		stackOne.pop();
		stackOne.displayStack();
		stackOne.pop();
		stackOne.displayStack();
		stackOne.pop();
		
		stackOne.isStackEmpty();	
	}
	
	/**
	 * Test that the rpn calculator works as expected
	 * 
	 * @param none
	 * @return none
	 */
	
	public void automatedRPNTest() {
		rpn1.initialiseStack();
		rpn1.processString();
		rpn1.displayStack();
	}
	
	/**
	 * Main method for running the testing
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Tester test = new Tester();
		
		test.initaliseRPNCalc();
		test.automatedRPNTest();
		
	}

}