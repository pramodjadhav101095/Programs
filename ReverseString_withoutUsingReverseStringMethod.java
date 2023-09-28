package logical_program;

public class ReverseString_withoutUsingReverseStringMethod {

	public static void main(String[] args) {
		
		String str = "Automation";
		
	char chars[]	= str.toCharArray();    // we can also use Split method- split(""); and have to store in String []
	
	for(int i=chars.length-1; i>=0;i--) {
		
		
		System.out.println(chars[i]);
	}
	
	
		
		
		

	}

}
