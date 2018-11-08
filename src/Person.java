import java.io.*;
import java.util.Scanner;

/**
 * @author jmacfawn
 *
 */

public class Person {
	
	private String name;
	private String[] allNames = new String[500];
	
	// Constructor to set name variable 
	public Person(String str)
	{     
		name = str;
	}
	
	// Constructor if name isn't known
	public Person()
	{
	 	name = null;	
	}

	// Get name variable 
	public String getName()
	{
		return name;
	}
	
	// Set name variable 
	public void setName(String str) 
	{
		name = str;
	}
	
	// Get length of name  
	public int getNameLength() 
	{
		return name.length();
	}
	
	// Read all names from text file and put into array
	private void getAllNames()
	{
		String file = "500names.txt";
		int i;
		
		try {
			Scanner sc = new Scanner(new File(file));

			for(i = 0; i < 500; i++)
			{
				allNames[i] = sc.nextLine();
			}
						
			sc.close();
				 
		}
		
		catch (IOException e) {
		  e.printStackTrace();
		}
		
	}
	
	/**
	 * Get set of names of size "numOfNames" from the list of 500.
	 * @param numOfNames
	 * @return arrayOfNames
	 */
	public String[] getSetOfNames(int numOfNames, int startPosition)  
	{
		
		String[] arrayOfNames = new String[numOfNames];
		getAllNames();
		int i;
		
		for (i = 0; i < numOfNames ; i++)
		{
			arrayOfNames[i] = allNames[i];
		}
		
		return arrayOfNames;
	}
	
	// From array of all names, get one name at a particular position
	public String getNameFromList(int position)
	{
		getAllNames();
		
		String name = allNames[position];
		
		return name;
	}
}

 


