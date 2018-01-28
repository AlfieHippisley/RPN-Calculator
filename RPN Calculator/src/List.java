
public class List {
	
	// Instance Variables
	private ListNode head;
	
	// Constructor
	public List() {
		head = null;
	}

	// Add A Number To The List
	public void addToList(int givenNumber)
   	{
	     ListNode  marker;
	     ListNode  newOne;
	        
	     newOne = new ListNode(givenNumber);        
	     newOne.setNext(head);
	        
	     head = newOne;
	     
   	}
	
	// Find a give number in the list
	public ListNode findInList(int givenNumber) 
	{
		ListNode marker, foundNode = null;
		
		for (marker = head; marker != null && foundNode == null; marker=marker.getNext())
	    {
			if (givenNumber == marker.getStoredNumber())
	        {
	                foundNode = marker;
	        }
	    }

	    return foundNode;
	}
	
	// Print everything in the list
	public void printList()
	{
		ListNode marker;

		if (head == null)
        {
        	System.out.println("The List Is Empty.");  
        }
        else
        {
        	System.out.println("The List Contains: ");    
	        for (marker = head; marker != null; marker=marker.getNext())
	        {
	        	System.out.println(marker.printInfo());  
	        }
        }
    }

	// Delete number from the start of the list
	public void deleteFromStart() 
	{
		// Set the marker to the head of the linked list
		ListNode marker = head;

		marker.getNext();
		
		// Now remove the reference to the first node
		head = marker.getNext();
		
	}
		
}

