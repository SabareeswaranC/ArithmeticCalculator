 package com.CourseEndProject1;

import java.util.*;

public class CEPMain {

	public static void main(String[] args) {
		
		CEPOperations cepo = new CEPOperations();
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Application!");
		
		System.out.println("---------------------------");
		
		do {
			
			System.out.println("\nEnter 1 to Retrieve\nEnter 2 to do Operations\nEnter 3 to Exit");
			
			System.out.println("Pick ur choice:");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				cepo.Retrieving();
				
				break;
				
			case 2:
				
				int t=1;
				
				do {
					
					System.out.println("\nEnter a to add\nEnter b to delete\nEnter c to search\nEnter d to go back to home");
					
					char ch = sc.next().charAt(0);
					
					switch(ch) {
					
					case 'a':
						
						cepo.Add();
						
						break;
						
					case 'b':
						
						cepo.delete();
						
						break;
						
					case 'c':
						
						cepo.search();
						
						break;
						
					case 'd':
						
						t=0;
					
					}
					
					
					
				}while(t!=0);
				
				break;
				
			case 3:
				
				System.out.println("-------------------------");
				
				System.out.println("Thanks for using the app.");
				
				System.exit(0);
				
			
			}
			
			
		}while(true);

	}

}
