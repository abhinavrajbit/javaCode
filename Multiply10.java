package com.wissen;

import java.util.Scanner;

public class Multiply10 {
	
	public static void main(String [] ar) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want table of :");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
	}

}
