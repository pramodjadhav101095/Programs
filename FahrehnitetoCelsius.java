package practice1;

import java.util.Scanner;

public class FahrehnitetoCelsius {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to Fahrenite");
		
		double fharenite = sc.nextDouble();
		double celsius =  ( (5*(fharenite-32.0))/9.0);
		
		System.out.println("value convereted in celsius = " + celsius);
		
	}
		
	}
	


