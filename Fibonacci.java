package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int first = 0;
		int second = 1;
		int third;
		int i;
		int num;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=0;i<=num;i++)
		{
			third = first + second;
			System.out.println("The fibonacci of " +first+ "and" +second+ "is" +third);
			first = second;
			second = third;
			
		}
		
		
	}

}
