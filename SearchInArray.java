package com.wissen;

import java.util.Scanner;

	public class SearchInArray {
			public static void main(String [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the number you want to search :");
		int num = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(num==arr[i]) {
				System.out.println("Number found : at index " + i );
				break;
			}
		}
		
	}
}
