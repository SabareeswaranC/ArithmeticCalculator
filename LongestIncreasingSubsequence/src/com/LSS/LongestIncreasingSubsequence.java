package com.LSS;

import java.util.*;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers to be added?");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		
		int max =0;
		
		int maxindex =0;
		
		int count =0;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]<arr[i+1]) {
				
				count=count+1;
				
			}
			else {
				
				if(count>max) {
				
				max = count;
				
				maxindex = i;
				
				}
				
				count =0;
				
			}
			
		}
		
		System.out.println("LongestIncreasingSubsequence");
		
		int l = maxindex-max;
		
		for(int j=0;j<=max;j++) {
			
			System.out.print(arr[l]+" ");
			l++;
			
		}

	}

}
