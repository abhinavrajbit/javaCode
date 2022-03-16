package com.wissen;

import java.util.Scanner;

class Food {

	void displayGreetings() {
		System.out.println("Welcome !!");
	}
}

class VegFood extends Food {
	
	void displayGreetings() {
		super.displayGreetings();
		System.out.println("South Indian");
		System.out.println("North Indian");
		System.out.println("Chinese");
	}
}

class NonVegFood extends Food {
	
	void displayGreetings() {
		super.displayGreetings();
		System.out.println("Punjabi Food");
		System.out.println("Sea Food");
		System.out.println("Non Veg Chinese");
	}
}

public class FoodRestuarant {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Food fd = null;
		
		System.out.println("Enter choice of food  Veg/NonVeg :");
		
		String str = sc.next();
		if(str.equalsIgnoreCase("veg")) {
			fd = new VegFood();
		}
		else {
			fd = new NonVegFood();
		}
		
		fd.displayGreetings();
			

	}

}
