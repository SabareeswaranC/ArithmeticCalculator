package com.Filehandling;

import java.util.*;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileHandlingOperations fho = new FileHandlingOperations();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Application!");
		
		System.out.println("---------------------------");
		
		do {
			
			System.out.println("\nEnter 1 to read\nEnter 2 to write\nEnter 3 to append\nEnter 4 to exit");
			
			System.out.println("Pick ur choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				fho.read();
				
				break;
				
			case 2:
				
				fho.write();
				
				break;
				
			case 3:
				
				fho.append();
				
				break;
				
			case 4:
				
				System.out.println("---------------------------------");
				
				System.out.println("Thanks for using the application.");
				
				System.exit(0);
			
			}
			
		}while(true);

	}

}
