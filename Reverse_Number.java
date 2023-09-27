package practice1;

import java.util.Scanner;

public class Reverse_Number {
	
	int number,digit,reverse;
	public static void main(String []args) {
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		Reverse_Number obj = new Reverse_Number();
		obj.Test2( number);
		}
	
	public  void Test2(int number) {
		
		
		while(number > 0) {
			
		digit=	number%10;
		
		reverse= reverse*10 +digit;
		number= number/10;
		
		}
		System.out.println(reverse);
	}

}
