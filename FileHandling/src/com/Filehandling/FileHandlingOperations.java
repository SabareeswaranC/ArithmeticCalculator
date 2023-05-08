package com.Filehandling;

import java.io.*;

import java.util.*;

public class FileHandlingOperations {
	
	Scanner sc = new Scanner(System.in);
	
	public void read() {
		
		
		 try (BufferedReader br = new BufferedReader(new FileReader("/Users/sabareeswaranchandrasekar/Desktop/CEPFolder/aara.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
		
	}
	
	public void write() {
		
		String content = "Hello, world!";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/sabareeswaranchandrasekar/Desktop/CEPFolder/aara.txt"))) {
            bw.write(content);
            System.out.println("Content written in the file");
        } catch (IOException e) {
            System.err.format("IOException: %s%n",e);
        }
		
	}
	
	public void append() {
		
		  String content = "Hello, again!";

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/sabareeswaranchandrasekar/Desktop/CEPFolder/aara.txt", true))) {
	            bw.write(content);
	            bw.newLine();
	            System.out.println("Content append in the file");
	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
		
	}

}
