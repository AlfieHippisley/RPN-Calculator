/**
 * Stack class for LinkNode Class and List Class
 * 
 * @author Alfie Hippisley
 * @version 28/01/2018
 */

public class Stack {
	
	// Instance variables
	private List listOne;
	
	/**
	 * Constructor to get the List class ready for use
	 * 
	 * @param none
	 * @return none
	 */
	
	public Stack()
	{
		listOne = new List();
	}
	
	/**
	 * Push data to the stack
	 * 
	 * @param data to be added to stack
	 * @return none
	 */
	
	public void push(int data) 
	{
		// Add the data to list
		listOne.addToList(data);
	}
	
	/**
	 * Pop data from the top of the stack
	 * 
	 * @param none
	 * @return number that was stored
	 */
	
	public int pop() 
	{
		// Before the data is lost take the data inside the node
		ListNode nodeToDelete = listOne.deleteFromStart();
		
		// Store the data inside 'number'
		int number = nodeToDelete.getStoredNumber();
		
		// Return that data
		return number;
	}
	
	/**
	 * Check if the stack is empty
	 * 
	 * @param none
	 * @return none
	 */
	
	public void isStackEmpty() 
	{
		// If stack is empty this will become true
		boolean listState = false;
		
		// Call checkIfEmpty from List class and assign the return value to 'listState'
		listState = listOne.checkIfEmpty(listState);
		
		// Show message accordingly
		if(listState == false) {
			System.out.println("\nThe stack contains data.");
		}
		else {
			System.out.println("\nThe Stack is empty.");
		}
	}
	
	public void displayStack() 
	{
		// Call printList to display the entire stack contents
		listOne.printList();
	}

}
