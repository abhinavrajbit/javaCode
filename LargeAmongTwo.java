package com.wissen;

import java.util.Scanner;

public class LargeAmongTwo {

	public static void main(String [] ar) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("1st Number is greater : " + num1);
		}
		else {
			System.out.println("2nd Number is greater : " + num2);
		}
		
		
	}
}
