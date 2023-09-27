package practice1;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		for(int a = 1; a<=20; a++) {
            int count = 0;
			for(int b = 1;b<=a; b++) {
				if(a%b == 0) {
					count++;
				}
					
			}if(count==2) {
				System.out.println("  Prime number is : "+a  );	
			}
			
		}
		
		Test1();
	}


  public static void Test1() {
	  
	  int n;
	  int count=0;
	  
	  System.out.println("Enter Number");
	  
	  Scanner src = new Scanner(System.in);
	  n=src.nextInt();
	  
	  for(int i=1; i<=n;i++) {
		  
		if(n%i==0) {
			
			count++;
		}  
		 
	  }
	  if(count==2) {
			 
			 
			 System.out.println("number is prime");
		 }
		 else {
			 System.out.println("number is not a prime ");
		 }
	  
	
	
}
	
	
	
	
	
	
}