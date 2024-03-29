
/**
 * Performs actions on the list's nodes
 * 
 * @author Alfie Hippisley/ AC12001 Team
 * @version 28/01/2018
 */

public class ListNode    
{
    // Instance variables
    private int storedNumber;
    private ListNode next;

    /**
     * Constructor for ListNode class
     * @param storedNumber for node
     */
    
    public ListNode(int storedNumber)
    {
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
        
        // Display the stored number of the node
        info = "Number being stored is " + storedNumber;
        
        return info;
    }
}
