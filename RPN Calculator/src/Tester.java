import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

	private List testList;
	
	public void initialise() 
	{
		testList = new List();
	}
	public void automatedTest() 
	{	
		// Add data to list and then display the data in each list node.
		testList.printList();
		testList.addToList(1);
		testList.printList();
		testList.addToList(2);
		testList.printList();
		testList.addToList(3);
		testList.printList();
	}
	
	public void fillList() {
		testList.addToList(1);
		testList.addToList(2);
		testList.addToList(3);
	}
	public void displayList() {
		testList.printList();
	}
	
	public void findNumber() {
		int givenNumber;
		ListNode foundNode;
		givenNumber = getIntException("Enter the number you want to find :");
		foundNode = testList.findInList(givenNumber);
		
		if (foundNode != null)
            System.out.println("Found a number, it is " + foundNode.getStoredNumber());
        else
            System.out.println("Number not in the list");     
	}
	
	public int getIntException(String userPrompt)
	{
		int num = 0;
		boolean valid = false;
		Scanner s = new Scanner(System.in);
		
		// Loop until we get a valid int input from the user
		do {
			try {
				System.out.print(userPrompt);
				num = s.nextInt();
				valid = true;
			}
			catch (InputMismatchException e)
			{
				// Read and discard the invalid input
				s.next();
				System.out.println("Please enter a valid integer:");
			}
		} while (!valid);
	
		return num;
	}
	
	public void removeNumber() {
		testList.deleteFromStart();
	}
	
	public static void main(String[] args) 
	{
		// Run Tests
		Tester test = new Tester();
		
		test.initialise();
		test.fillList();
		test.displayList();
		test.removeNumber();
		test.displayList();
		

	}

}
