package practice1;

import java.util.Scanner;

// Write a program to print Stars using for loop where the number of Stars printed
// should be equal to the row number

public class Starpattern1 {
	public static void main(String[] args) {
		System.out.println("Enter NO of rows");
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		printStar(row);
		
	}
      public static void printStar(int n) {
    	  
    	  for(int i=0;i<n;i++) {
    		  for(int j=0;j<=i;j++) {
    			  
    			  System.out.println("*");
    		  }
    		  System.out.println();
    	  }
    	  
      }
}
