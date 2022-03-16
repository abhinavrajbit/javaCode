package com.wissen;

import java.util.Scanner;

	public class ValidAge {
		public static void main(String [] ar) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Valide for Voting ");
		}
		else {
			System.out.println("Not Valide for Voting : ");
		}
		
		
	}
}
