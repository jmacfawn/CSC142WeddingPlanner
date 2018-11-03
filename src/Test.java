import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	private static String file = "500names.txt";

	public static void main(String[] args) throws FileNotFoundException{

		try {
			Scanner sc = new Scanner(new File("500names.txt"));
			
			System.out.println("We got the file");
	
			// your code to read the file must be added
		        // here.  Use sc.nextLine() to read each line as a String	
				 
		}	
					
	
		catch (IOException e) {
		 // TODO Auto-generated catch block
		  e.printStackTrace();
		}
		
	
	
}
	
}
