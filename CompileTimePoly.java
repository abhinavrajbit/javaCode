package com.wissen;

import java.util.Scanner;

public class CompileTimePoly {
	
	static boolean isPalimdrone(String s) {
		
		char charArr [] = s.toCharArray();
		int l=0,r=charArr.length-1;
		while(l<r) {
			if(charArr[l++]!=charArr[r--])
				return false;
		}
		return true;
	}	
	
	static boolean isPalimdrone(int x) {
		
		int dig =0,temp=x;
		while(x>0) {
			int rem = x%10;
			dig = dig*10 + rem;
			x = x/10;
		}
		return temp==dig;
	}
	
	public static void main(String [] ars) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String for checking palimdrome  : ");
		String s = sc.next();
		System.out.println("Given String "+s + " is palindrome ? " + CompileTimePoly.isPalimdrone(s));
		
		
		System.out.println("Enter Number for checking palimdrome  : ");
		int n = sc.nextInt();
		System.out.println("Given String "+n + " is palindrome ? " + CompileTimePoly.isPalimdrone(n));
		
	}
}
