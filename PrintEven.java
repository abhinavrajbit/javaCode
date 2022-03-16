package com.wissen;

import java.util.Scanner;

public class PrintEven  {
	
	public static void main(String [] a) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n :" );
		int n = sc.nextInt();
		
//		for(int i=2;i<=n;i=i+2)
//			System.out.println(i);
		
		for(int i =1;i<=n;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	

}
