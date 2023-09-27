package com.prowings.basic;

import java.util.Scanner;

public class ElseIf_logicalOperator {
	
	// check for Grade based on Marks

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter your marks");

		int marks = sc.nextInt();
		
		
		if(marks<35) {
			System.out.println(" you are Fail");
		}
		
		else if(marks>= 35 && marks<=50){
			
			System.out.println(" you have obtained C Grade");
			
		}
		else if (marks>=51 && marks <=65) {
			
			System.out.println(" you have obtained B Grade");	
		}
		else if (marks>=66 && marks<=80) {
			System.out.println(" you have obtained A Grade");
		}
		else if (marks>=81 && marks<=100) {
			System.out.println(" you have obtained A+ Grade");
	}
		sc.close();
	}
}
