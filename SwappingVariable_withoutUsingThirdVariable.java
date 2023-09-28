package logical_program;

import java.util.Scanner;

public class SwappingVariable_withoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		System.out.println("before Swapping number" + x + y);
		
		
		x = x-y;
		y = x+y;
		x = x-y;
		
		System.out.println("after swapping "+ x + y );
		
	}

}
