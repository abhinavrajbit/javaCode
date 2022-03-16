package com.wissen;

import java.util.Scanner;

public class FunctionExample {
	
	//Function for getting cube
	int cube(int x) {
		return x*x*x;
	}
	
	
	//Functions for reverse a number
	int reverseDigit(int x) {
		
		int dig =0;
		while(x>0) {
			int rem = x%10;
			dig = dig*10 + rem;
			x = x/10;
		}
		return dig;
	}
	
	//Function for checking palindrome
	boolean isPalimdrone(String s) {
		
		char charArr [] = s.toCharArray();
		int l=0,r=charArr.length-1;
		while(l<r) {
			if(charArr[l++]!=charArr[r--])
				return false;
		}
		return true;
	}
	boolean isPrim(int x) {
		
		if(x<=1)
			return false;
		
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//Function for printing fibonacci
	 static void printFibonacciNumbers(int n)
	    {
	        int f1 = 0, f2 = 1, i;
	 
	        if (n < 1)
	            return;
	        System.out.print(f1 + " ");
	        for (i = 1; i < n; i++)
	        {
	            System.out.print(f2 + " ");
	            int next = f1 + f2;
	            f1 = f2;
	            f2 = next;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionExample fe = new FunctionExample();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number for finding cube : ");
//		int c = sc.nextInt();
//		int cubeValue = fe.cube(c);
//		System.out.println("Cube of "+c + " is " + cubeValue);
		
		
//		System.out.println("Enter Number for reverse  : ");
//		int rev = sc.nextInt();
//		int reverseValue = fe.reverseDigit(rev);
//		System.out.println("Reverse of "+rev + " is " + reverseValue);
		
		
//		System.out.println("Enter Number for checking palimdrome  : ");
//		String s = sc.next();
//		boolean isPal = fe.isPalimdrone(s);
//		System.out.println("Given number "+s + " is palindrome ? " + isPal);
		
		
//		System.out.println("Enter Number to which you want fibb  : ");
//		int fib = sc.nextInt();
//		FunctionExample.printFibonacciNumbers(fib);
		
		
//		System.out.println("Enter Number check prime  : ");
//		int prime = sc.nextInt();
//		boolean isPrime = fe.isPrim(prime);
//		System.out.println("Given number "+prime + " is prime ? " + isPrime);
		
		int num1, num2;
	    
	      System.out.println("Enter first number for swaping :");
	      num1 = sc.nextInt();
	      
	      System.out.println("Enter Second Number for swaping : ");
	      num2 = sc.nextInt();
	      
	      System.out.println("Value of num1 and num2 before swapping : " + num1 +"  " + num2);
	      int temp = num1;
	      num1 = num2;
	      num2=temp;
	      
	      System.out.println("Value of num1 and num2 after swapping : " + num1 +"  " + num2);
	      
	}

}
