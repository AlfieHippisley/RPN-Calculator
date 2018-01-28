
/**
 * List class for LinkNode class and Stack class
 * 
 * @author Alfie Hippisley/ AC12001 Team
 * @version 28/01/2018
 */

public class List 
{
	// Instance variables (Renamed head to top because this is being used in the context of a stack)
    private ListNode top;
    
    /**
     * Constructor for objects of class List
     * Create a head for the linked list
     */
    
    public List()
    {
        top = null;
    }

     /**
     * Add a new node at the start of a list
     * 
     * @param  data to add
     * @return nothing    
     */
    
    public void addToList(int givenNumber)
    {
    	// Create new node
        ListNode  marker;
        ListNode  newOne;
        
        // Store the number being passed in the new node
        newOne = new ListNode(givenNumber);     
        
        // Set the next reference to the top of the list
        newOne.setNext(top);
        
        // Set the top of the list to the new node
        top = newOne;
    }
 
    /**
     * Print the list, starting at head
     * 
     * @param  none
     * @return nothing    
     */
    
     public void printList()
     {
        ListNode marker;

        // If the top of the list is null we can assume the list empty
        if (top == null)
        {
        	System.out.println("The list is empty.");  
        }
        
        // If not then there is contents to show
        else
        {
	        System.out.println("The list contains:");  

	        // Loop showing content until no more nodes
	        for (marker = top; marker != null; marker=marker.getNext())
	        {
	              System.out.println(marker.printInfo());  
	        }
        }
    }

   /**
     * Find a node
     * 
     * @param  Number to find
     * @return node if found, else null
     */
     public ListNode findInList(int storedNumber)
    {
        ListNode marker, foundNode=null;
        
        // Go though the list checking if the number has been found
        for (marker = top; marker != null && foundNode == null; marker=marker.getNext())
        {
            if (storedNumber == marker.getStoredNumber())
            {
                foundNode = marker;
            }
        }

        // Return the foundNode
        return foundNode;  
    }
     
    /** 
     * Delete the node from the top of the list
     * 
     * @param none
     * @return none
     */
     
    public ListNode deleteFromStart() {
    	
    	boolean emptyStack = false;
    	
    	ListNode nodeToDelete = top;
    	
    	// Check if stack empty first
    	emptyStack = checkIfEmpty(emptyStack);
    	
    	// If true nothing to delete
    	if(emptyStack == true) {
    		return null;
    	}
    	
    	// Else, go delete by removing reference, however we return the node so we can extract the data for the RPN
    	else {
    		nodeToDelete.getNext();
    		top = nodeToDelete.getNext();
    		return nodeToDelete;
    	}
    }
    
    /**
     * Check if the list is empty
     * 
     * @param none
     * @return none
     */
    
    public boolean checkIfEmpty(boolean empty) {
    	
    	// Start at the top of the list
    	ListNode marker = top;
    	
    	// If nothing in the list next its empty
    	if (marker == null){
    		empty = true;
    	}
    	
    	// Else, the list is not empty
    	else {
    		empty = false;
    	}
    	
    	// Return the state of the list
    	return empty;
    }
}
