/**
 * @author jmacfawn
 *
 */

public class Person {
	
	private String name;
	private String[] allNames;
	
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
	
	public String[] getGroupfNames(int num, int i)
	{
		
		return
	}
	
	
	public static void main(String[] args) {   // a main for testing
		Person person = new Person("Isaac");

		String person1;
		
		person1 = person.getName();
		
		person.setName("Joshua");

		person1 = person.getName();
		
		int person1Length = person.getNameLength();
		
		System.out.println(person1Length); 
	}

}

 


