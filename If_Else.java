package com.prowings.basic;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		
		int number = sc.nextInt();
		
		
		if(number%2==0) {
			
			System.out.println("number is even");
		}
		else {
			
			System.out.println("nubmer is odd");
		}
	}

}
