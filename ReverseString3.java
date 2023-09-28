package logical_program;

import java.util.Scanner;

public class ReverseString3 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to be reverse");
		
		String str =sc.nextLine();
		
	    
		String str1[]=str.split("");
		
		for(int i = str.length()-1; i>=0;i--) {
			
			
			System.out.print(str1[i]);
			
			
		}
		
		

	}

}
