package com.wissen;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class DemoClass {
	
	static double sqrt(double x) {
		return Math.sqrt(x);
	}
	
	static void changeName(Student obj) {
		obj.setName("Abhinav");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number to find square root : ");
//		double data = sc.nextDouble();
//		System.out.println("Square root is " +  DemoClass.sqrt(data));
//		
		Student student = new Student();
		System.out.println("Enter Student Name : ");
		student.setName(sc.next());
		System.out.println("Enter Student ID : ");
		student.setId(sc.nextInt());
		
		System.out.println("STudent name and ID before call by reference " + 
		student.getName() + " " + student.getId());
		
		DemoClass.changeName(student);
		System.out.println("STudent name and ID before after by reference " + 
				student.getName() + " " + student.getId());
		
		
		
		

	}

}
