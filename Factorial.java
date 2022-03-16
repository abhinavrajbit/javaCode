package com.wissen;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String [] a) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial :");
		int n = sc.nextInt();
		int i,fact=1;
		for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }   
		System.out.println("Factorial of " + n + " is " + fact);
		int res = fact(n);
		System.out.println("Factorial of " + n + " is " + res);
	}

	private static int fact(int n) {
		if(n==0 || n==1)
		return 1;
		
		return(fact(n-1) *n);
	}

}
