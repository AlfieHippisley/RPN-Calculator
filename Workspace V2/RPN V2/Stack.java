
public class Stack {
	
	private List listOne;
	
	/**
	 * Get the list/stack ready for use
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
		ListNode nodeToDelete = listOne.deleteFromStart();
		int number = nodeToDelete.getStoredNumber();
		
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
		boolean listState = false;
		
		listState = listOne.checkIfEmpty(listState);
		
		if(listState == false) {
			System.out.println("\nThe stack contains data.");
		}
		else {
			System.out.println("\nThe Stack is empty.");
		}
	}
	
	public void displayStack() 
	{
		listOne.printList();
	}

}
