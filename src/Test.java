import java.io.*;
import java.util.Scanner;

public class Test {
	
	private static String file = "500names.txt";

	public static void main(String[] args) throws FileNotFoundException{
		
		String[] array = {"items", "and", "more"}; 

		try {
			Scanner sc = new Scanner(new File("500names.txt"));
						
			int j = 0;
			
			for(int i = 0; i < 10; i++ ) {
				System.out.println(sc.nextLine());
				
			}
		
			sc.close();
		}	
					
		
		
		catch (IOException e) {
		 // TODO Auto-generated catch block
		  e.printStackTrace();
		}
		
	
	
}
	
}
