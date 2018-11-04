/**
 * @author jmacfawn
 *
 */

import java.lang.*;

public class Table {

	private int mSize;
	private int nSize;
	private double numOfM;
	private Integer numOfN;
	private int numOfGuests;
	
	
	/**
	 * @param m Max table size
	 * @param n Max table size - 1
	 */
	public Table(int m, int n)
	{
		mSize = m;
		nSize = m - 1;
		numOfGuests = n;
	}
	
	public int getMTableSize()
	{
		return mSize;
	}
	
	public int getNTableSize() 
	{
		return nSize;
	}
	
	public double getNumOfM() 
	{
		return numOfM;
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
	
	
	
	public static void main(String[] args) 
	{
		Table table = new Table(7, 75);
		
		table.optimalSeating();
		
		
		//double k = (((double)(67 - 1)) / 8);
		
		
		//int num = Math.decrementExact(3.5);
		System.out.println(table.getNumOfM());
		System.out.println(table.getNumOfN());
	}

}
