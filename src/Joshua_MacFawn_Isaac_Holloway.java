/**
 * CSC 142 group project #1: Wedding planner program. 
 * Business need is to produce a program to assist a wedding 
 * planner with seating arrangements. Input is number of guests
 * and max table size. Output is number of max and max-1 tables 
 * along with guests assigned to each table.  
 * @author Joshua MacFawn and Isaac Holloway
 *
 */

import java.util.Scanner;
import java.lang.*;

public class Joshua_MacFawn_Isaac_Holloway {

	/**
	 * 
	 */
	public Joshua_MacFawn_Isaac_Holloway() {
		 
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many guests will each table hold? (4-25) ");
		int mSize = scanner.nextInt();
		
		System.out.print("How many guests will be attending the wedding? (20-500) ");	
		int numOfGuests = scanner.nextInt();
	
		
		/**
		 * Check if inputs are within the limits of the program
		 * Program supports:
		 * # of Guests: 20 - 500
		 * Max Table Sizes: 4 - 25 
		 */
		if((mSize < 4 || mSize > 25) || (numOfGuests < 20 || numOfGuests > 500))
		{
			System.out.println("This program doesn't support your inputs. "
					+ "Please assign seating manually.");
		}
		else 
		{
			Table table = new Table(mSize, numOfGuests);
			
			// Determine optimal seating arrangement 
			table.optimalSeating();
			
			System.out.println();
			
			// Display optimal seating arrangement
			table.displayOptimalArrangement();
			
			System.out.println();
			
			// Ask user if they want the output
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to see the table assignments? (Yes/No)");
			String seeOutput = sc.nextLine().substring(0, 1);
			
			// If yes, display the table assignments
			if(seeOutput.equals("y") || seeOutput.equals("Y"))
			{
				System.out.println();
				table.getTableAssignments();
			}
		}	
	}
}
