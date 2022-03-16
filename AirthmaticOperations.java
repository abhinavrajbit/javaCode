package com.wissen;

import java.util.Scanner;

public class AirthmaticOperations {
	
	public static void main(String [] args) {
		int a,b;
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number :");
	      a = sc.nextInt();
	      
	      System.out.println("Enter Second Number: ");
	      b = sc.nextInt();
	      sc.close();
		 System.out.println("a + b = " + (a + b));

	    System.out.println("a - b = " + (a - b));

	    System.out.println("a * b = " + (a * b));

	    System.out.println("a / b = " + (a / b));

	    System.out.println("a % b = " + (a % b));
	  }
		
	}


