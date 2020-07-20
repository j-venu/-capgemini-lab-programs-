package com.capg.age;

import java.util.Scanner;

public class Evaluator {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the age");
	
	try {
		int n=scanner.nextInt();
		if(n>15)
		{
			throw new  AgeEvaluatorException("age evaluator exception");
			
		}
		else
		{
			System.out.println("Age is Valid");
		}
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
		
		
	}
	
	
	}
	


