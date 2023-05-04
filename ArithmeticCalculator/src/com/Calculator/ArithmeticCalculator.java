package com.Calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	static Scanner sc = new Scanner(System.in);
	
	int res = 0;
	
	public static void Addition() {
		
		System.out.println("How many numbers to be added? ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("Enter the numbers: ");
		
		for(int i=0;i<n;i++) {
			
			sum = sum + sc.nextInt();
			
		}
		
		System.out.println("Result: "+sum);
		
	}
	
	public static void Subtraction() {
			
			System.out.println("Enter the number in which the value to be subtracted: ");
			
			int n = sc.nextInt();
			
			System.out.println("Enter the number which is to be subtracted: ");
			
			int m = sc.nextInt();
			
			int sum = n - m;
			
			System.out.println("Result: "+sum);
			
		}
		
	public static void Multiplication() {
			
			System.out.println("How many numbers to be multiplied? ");
			
			int n = sc.nextInt();
			
			int sum = 1;
			
			System.out.println("Enter the numbers: ");
			
			for(int i=0;i<n;i++) {
				
				sum = sum * sc.nextInt();
				
			}
			
			System.out.println("Result: "+sum);
			
		}
	
	public static void Division() {
		
		System.out.println("Enter the number to be divided: ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the number by which it divided: ");
		
		int m = sc.nextInt();
		
		int sum = n / m;
		
		System.out.println("Result: "+sum);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Arithmetic Calculator!...");

		Scanner sc1 = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			
			System.out.println("\nPick ur choice in the above...");
			
			int choice = sc1.nextInt();
			
			switch(choice) {
			
			case 1:
				
				Addition();
				
				break;
				
			case 2:
				
				Subtraction();
				
				break;
				
			case 3:
				
				Multiplication();
				
				break;
				
			case 4:
				
				Division();
				
				break;
				
			case 5:
				
				System.out.println("Thanks for using the application.");
				
				System.exit(0);
				
				
			}
			
		}while(true);
		
	}

}
