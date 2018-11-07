import java.util.*;

/**
 * @author jmacfawn
 *
 */

public class Table {

	private int mSize;
	private int nSize;
	
	private double numOfM;
	private Integer numOfN;
	
	private int numOfGuests; 
	
	
	/**
	 * Constructor for Table class. 
	 * @param m Max table size
	 * @param n Max table size - 1
	 */
	public Table(int m, int n)
	{
		mSize = m; // Max table size
		nSize = m - 1; // Max table size - 1
		numOfGuests = n; // Total number of guests
	}
	
	public int getNumOfGuests()
	{
		return numOfGuests;
	}
	
	public int getMTableSize()
	{
		return mSize;
	}
	
	public int getNTableSize() 
	{
		return nSize;
	}
	
	public int getNumOfM() 
	{
		int numOfMInt = (int) Math.round(numOfM);
		
		return numOfMInt;
	}
	
	public int getNumOfN() 
	{
		return numOfN;
	}
	
	public void optimalSeating() 
	{
		int i, j;
		
		do 
		{
			// Loop through checking for solutions of m & n number of tables
			for(i = 0; i <= numOfGuests ; i++)
			{
				// Take # of guests minus the i pointer & divide by max table size
				numOfM = (((double)(numOfGuests - i)) / mSize);
				
				// If result above is a whole number...
				if((numOfM % 1) == 0)
				{
					// ...check if the i pointer value is divisible by max-1 
					j = (i % nSize);
					
					// If i is divisible by max-1...
					if(j == 0) 
					{
						// Assign # of max-1 tables to result & break out of loop
						numOfN = (i / nSize);
						break;
					}
				}
			} 
		} 
		while(numOfN == null);
		
	}
	
	public void displayOptimalArrangement() 
	{
		System.out.println("With " + getNumOfGuests() + " guests and a maximum of "
				+ getMTableSize() + " guests per table, the optimal seating"
						+ " arrangement should have " + getNumOfM() + " tables of "
						+ getMTableSize() + " guests and " + getNumOfN() + " tables of "
						+ nSize + " guests.");
	}
	
	// Get people assigned to a table 
	public void getTableAssignments() 
	{
		int listPosition = 0, lastTableFilled = 0;
		int tablesNeeded = (getNumOfM() + getNumOfN());
		String[][] tableAssignments = new String[tablesNeeded][mSize];
		
		Person p = new Person();
		
		// Tables
		for (int x = 0; x < getNumOfM(); x++) 
		{
		    // Names
			for (int y = 0; y < mSize; y++) 
		    {
				tableAssignments[x][y] = p.getNameFromList(listPosition);
		        listPosition++;
		    }
			lastTableFilled++;
		}
		
		if(getNumOfN() > 0)
		{
			for (int a = 0 ; a < getNumOfN(); a++) 
			{
			    // Names
				for (int b = 0; b < nSize; b++) 
			    {
					tableAssignments[lastTableFilled][b] = p.getNameFromList(listPosition);
			        listPosition++;
			    }
				lastTableFilled++;
			}
		}
		
	
		
		for(int c = 0; c < tableAssignments.length ; c++ )
		{
			System.out.println("Table " + (c + 1) );
			System.out.println("--------------------");
			
			for(int d = 0; d < mSize ; d++)
			{
				if( tableAssignments[c][d] == null)
				{
					System.out.println("EMPTY");
				} else {
					System.out.println(tableAssignments[c][d]);
				}
				
			}
			System.out.println();
		}
		
		

//		
		
	}
	
	public static void main(String[] args) 
	{
		Table table = new Table(8, 63);
		
		table.optimalSeating();
		
		table.getTableAssignments();
		
		
		
		
		
	}

}
