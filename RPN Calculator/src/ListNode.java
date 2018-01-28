
public class ListNode {

	// Instance Variables
	private int storedNumber;
	private ListNode next;
	
	// Constructor
	public ListNode(int givenNumber)
	{
		this.storedNumber = givenNumber;
		this.next = null;
	}
	
	// Get Next Node
	public ListNode getNext() 
	{
		return next;
	}
	
	// Get the currently stored number
	public int getStoredNumber() {
		return storedNumber;
	}
	
	// Set The Next Node
	public void setNext(ListNode next) 
	{
		this.next = next;
	}
	
	// Display the data in the node
	public String printInfo() 
	{
		String data;
		
		data = "The number is this node is" + storedNumber;
		
		return data;
	}
}
