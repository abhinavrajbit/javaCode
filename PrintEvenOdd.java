package com.wissen;

import java.util.Scanner;

		public class PrintEvenOdd {
			public static void main(String [] a) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number till you want to print odd/even :");
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		if(i%2==0)
			System.out.println(i + " is Even");
		else
			System.out.println(i + " is Odd");
	}
	
	}
}
