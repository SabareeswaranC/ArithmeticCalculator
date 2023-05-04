package com.EmailID;

import java.util.*;
import java.util.Scanner;

public class EmailID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<String> arr = new ArrayList<String>();
		
		do {
			
			System.out.println("\n1.Adding the EmailID\n2.Searching the EmailID\n3.View the EmailIDs\n4.Exit");
			
			System.out.println("Pict your choice...");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				
				System.out.println("How many EmailIDs do you want to add? ");
				
				int n = sc.nextInt();
				
				System.out.println("Enter the EmailIDs: ");
				
				for(int i=0;i<n;i++) {
					
					arr.add(sc.next());
					
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter the EmailID to search: ");
				
				String s = sc.next();
				
				int flag=0;
				
				for(String search: arr) {
					
					if(s.equals(search)) {
						
						System.out.println("EmailID is Validated.");
						
						flag =1;
						
						break;
						
					}
					
				}
				
				if(flag==0) {
				
				System.out.println("EmailID is not Validated.");
				
				}
				
				break;
				
			case 3:
				
				System.out.println("List of the Strings: ");
				
				for(String sp: arr) {
					
					System.out.println(sp+" ");
				}
				
				break;
				
			case 4:
				
				System.out.println("The End.");
				
				System.exit(0);
				
			
			}
			
		}while(true);

	}

}
