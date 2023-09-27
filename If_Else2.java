package com.prowings.basic;

import java.util.Scanner;

public class If_Else2 {

	// Eligiblity for Vote
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your edge");
		
		int ege = sc.nextInt();
		
		if(ege > 18) {
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}

	}

}
