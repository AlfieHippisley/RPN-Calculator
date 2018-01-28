
/**
 * Allows the user to use the program via menu user interface
 * 
 * @author Alfie Hippisley
 * @version 28/01/2018
 */

import java.util.Scanner;

public class Menu {

	/**
	 * Main menu for the user to navigate, continues to appear until program exit
	 * 
	 * @param none
	 * @return none
	 */
	
	public void displayMenu() {
			
			// New scanner object for menu input
			Scanner scanner = new Scanner(System.in);
			
			// Varible to store user input
			int choice = 0;
			
			// Show menu
			System.out.println("\nRPN Calculator :");
			System.out.println("\nPlease choose an option from the menu :");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1 : Make a calculation.");
			System.out.println("2 : How to use this calculator.");
			System.out.println("3 : Exit this calculator.");
			
			// Get input from user
			choice = scanner.nextInt();
			
			// Case statements to respond to user input
			switch(choice) {
			
			// Perform rpn calculations
			case 1:
				makeCalculation();
			break;
			
			// Guide the user on the valid was to perform calculations
			case 2:
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("To enter a sum place a ',' between each number/operator.");
				System.out.println("\n[1 1 +] Would be written as [1,1,+]\n");
				System.out.println("--------------------------------------------------------------------------------");
			break;
			
			// Exit the program
			case 3:
				System.exit(0);
			break;
			}		
	}
	
	/**
	 * Runs the RPNCalculater class and performs calculation
	 * 
	 * @param none
	 * @return none
	 */
	
	public void makeCalculation() {
		
		// Create RPN Calculator object
		RPNCalculator rpn1 = new RPNCalculator();
		
		// Run calculation
		rpn1.initialiseStack();
		rpn1.processString();
	}
	
	/**
	 * Main method. Has while loop to keep menu going
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// New menu object
		Menu mainMenu = new Menu();
		
		// Menu on/off
		boolean showMenu = true;
		
		// While loop to allow repeated actions on main menu
		while(showMenu == true){
			mainMenu.displayMenu();
		}
	}
}
