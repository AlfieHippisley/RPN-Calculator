
/**
 * Performs actions on the list's nodes
 * 
 * @author AC12001 Team
 * @version January 2013
 */
public class ListNode    
{
    // instance variables
    private int storedNumber;
    private ListNode next;

    /**
     * Constructor for objects of class List
     */
    public ListNode(int storedNumber)
    {
        // initialise instance variables
        this.storedNumber = storedNumber;
        this.next = null;
    }
    
     /**
     * Get the next node
     * 
     * @param  none
     * @return the next node
     */
    public ListNode getNext()
    {
        return next;
    }
    
     /**
     * Get the number being stored
     * 
     * @param  none
     * @return number at this node
     */
    public int getStoredNumber()
    {
        return storedNumber;
    }

     /**
     * Set the next node
     * 
     * @param  the node to be added at this node's next
     * @return nothing
     */
    public void setNext(ListNode next)
    {
        this.next = next;
    }
    
     /**
     * Return a string containing the data from this node, formatted
     * 
     * @param  nothing
     * @return nothing
     */
    public String printInfo()
    {
        String info;
        
        info = "Number being stored is " + storedNumber;
        
        return info;
    }
}
