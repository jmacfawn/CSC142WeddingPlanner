/**
 * @author jmacfawn
 *
 */

public class Person {
	
	private String name;
	private String[] allNames = { "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };
	
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
	
	public String[] getSetOfNames(int numOfNames, int startPosition)
	{
		String[] arrayOfNames = new String[numOfNames];
		int i;
		
		for (i = 0; i < numOfNames ; i++)
		{
			arrayOfNames[i] = allNames[startPosition];
			startPosition++;
		}
		
		return arrayOfNames;
	}
	
	
	public static void main(String[] args) {   // a main for testing
		Person person = new Person();

		String[] table1 = person.getSetOfNames(5, 0);
		
		System.out.print(table1[3]);
		
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

 


