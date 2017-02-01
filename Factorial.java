package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		int i;
		int fact=1;
		int num;
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("the factorial of " +num + " is " +fact);
	}

}
