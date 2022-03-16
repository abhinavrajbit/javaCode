package com.wissen;

import java.util.Scanner;

public class Reverse {

	public static void main(String [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int l=0,r=arr.length-1;
		while(l<r) {
			int temp =arr[l];
			arr[l++]=arr[r];
			arr[r--]=temp;
		}
		System.out.println("Element after reversed ");
		for( int el : arr)
			System.out.println("  "+ el);
	}
}
