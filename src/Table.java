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
	
	private String[] tablesNeeded; 
	
	
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
		
		int i, j; 
		
		
		int slots = numOfGuests + getNumOfM() + getNumOfN(); 
		
		Person p = new Person();
		String[] listOfNames = p.getSetOfNames(slots);
		
		HashMap<Integer, String> tableMap = new HashMap<Integer, String>();
		
		for(i = 0; i < listOfNames.length ; i++)
		{	
			tableMap.put(i, listOfNames[i]);
		}
		
		tableMap.put(0, "Table 1");
		
		int tableNum = 2;
		int listPosition = 0;
		
		
		for(j = 1; j <= slots; j++)
		{
			
			if((j % (mSize + 1)) == 0)
			{
				tableMap.put(j, "Table " + tableNum);
				tableNum++;
				listPosition = j; 
			}
			
			
		}
		
//		if(((mSize + 2) % i) == 0)
//		{
//			tableMap.put(i, "Table");
//		}
		
		
		
//		for(i = 0 ; i < numOfM ; i++)
//		{
			
			
//			for(j = 0; j < listOfNames.length; j++) 
//			{
//				tableMap.put(j, listOfNames[j]);
//			}
//		}
		
		for(String n : tableMap.values())
		{
			System.out.println(n);
		}
		


		
		
//		for(i = 0 ; i < numOfM ; i++) 
//		{
//			System.out.println("TABLE");
//			String[] listOfNames = p.getSetOfNames(mSize, startPosition);
//			
//			
//			for(j = 0; j < listOfNames.length; j++) 
//			{
//				System.out.println(listOfNames[j]);
//			}
//			
//			startPosition += mSize;
//			
//		}
//		
//		
//		
//		for(a = 0 ; a < numOfN ; a++) 
//		{
//			System.out.println("SMALLTABLE");
//			String[] listOfNames = p.getSetOfNames(nSize, startPosition);
//			startPosition += nSize;
//			
//			for(b = 0; b < listOfNames.length; b++) 
//			{
//				System.out.println(listOfNames[b]);
//			}
//			
//		}
		
//		Person p = new Person();
//		String[] listOfNames = p.getSetOfNames(5, 0);
		
//		int j;
//		
//		for(j = 0; j < listOfNames.length; j++) 
//		{
//			System.out.println(listOfNames[j]);
//		}
		
		
	}
	
	public static void main(String[] args) 
	{
		Table table = new Table(8, 73);
		
		table.optimalSeating();
		
		table.getTableAssignments();
		
		
		
	}

}
