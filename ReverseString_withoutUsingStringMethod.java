package logical_program;

public class ReverseString_withoutUsingStringMethod {
	
	
	public static void main(String[]args) {
		
		
		 String str = "Automation";
		
		 StringBuilder str1 = new StringBuilder();
		
	      str1.append(str);      // store String str into str1 by using append method.
	
	      str1 = str1.reverse();
	     System.out.println(str1);
	}

}
