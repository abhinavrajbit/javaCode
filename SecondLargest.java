package com.wissen;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int second;
		int first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
 
            else if (arr[i] > second && arr[i] != first)
            	 second = arr[i];

		
	}
        System.out.print("The second largest element"
                + " is " + second);
		
	}
		
               
}


