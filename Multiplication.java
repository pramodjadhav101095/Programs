package practice1;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
	System.out.println("enter number");	
	Scanner scr = new Scanner(System.in);	
	int number = scr.nextInt();
	
	System.out.println("enter Multiplication range");
	
	int range = scr.nextInt();
		
		for(int i=1; i<=range;i++) {
			
			System.out.printf("%d * %d = %d \n", number, i, number * i);
		
	}

}
}