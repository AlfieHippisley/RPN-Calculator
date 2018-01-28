
/**
 * Lab 1
 * 
 * @author AC12001 Team
 * @version January 2013
 */
public class List 
{
    private ListNode head;
    
    /**
     * Constructor for objects of class List
     * Create a head
     */
    public List()
    {
        head = null;
    }

     /**
     * Add a new node at the start of a list
     * 
     * @param  data to add
     * @return nothing    
     */
    public void addToList(int givenNumber)
    {
        ListNode  marker;
        ListNode  newOne;
        
        newOne = new ListNode(givenNumber);        
        newOne.setNext(head);
        
        head = newOne;
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

        if (head == null)
        {
        	System.out.println("The list is empty.");  
        }
        else
        {
	        System.out.println("The list contains:");    
	        for (marker = head; marker != null; marker=marker.getNext())
	        {
	              System.out.println(marker.printInfo());  
	        }
        }
    }

   /**
     * Find a node
     * 
     * @param  Student to find
     * @return node if found, else null
     */
     public ListNode findInList(int storedNumber)
    {
        ListNode marker, foundNode=null;
        
        for (marker = head; marker != null && foundNode == null; marker=marker.getNext())
        {
            if (storedNumber == marker.getStoredNumber())
            {
                foundNode = marker;
            }
        }

         return foundNode;  
    }
     
    /** 
     * Delete the node from the top of the list
     * 
     * @param none
     * @return none
     */
     
    public ListNode deleteFromStart() {
    	// TODO Add empty check
    	boolean emptyStack = false;
    	
    	ListNode nodeToDelete = head;
    	
    	emptyStack = checkIfEmpty(emptyStack);
    	
    	if(emptyStack == true) {
    		return null;
    	}
    	else {
    		nodeToDelete.getNext();
    		head = nodeToDelete.getNext();
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
    	
    	ListNode marker = head;
    	
    	if (marker == null){
    		empty = true;
    	}
    	else {
    		empty = false;
    	}
    	
    	return empty;
    }
}