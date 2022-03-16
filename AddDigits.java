package com.wissen;

import java.util.Scanner;

public class AddDigits {

	public static void main(String [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int sum=0;
		
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		
		System.out.println("Sum is " + sum);
	}
}
