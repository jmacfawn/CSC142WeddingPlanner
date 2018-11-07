import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	
	public String getNameFromList(int position)
	{
		getAllNames();
		
		String name = allNames[position];
		
		return name;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {   // a main for testing
		Person person = new Person();

		String[] table1 = person.getSetOfNames(500, 0);
		
		System.out.print(table1[499]);
		
//		String person1;
//		
//		person1 = person.getName();
//		
//		person.setName("Joshua");
//
//		person1 = person.getName();
//		
//		int person1Length = person.getNameLength();
//		
//		System.out.println(person1Length); 
	}

}

 


