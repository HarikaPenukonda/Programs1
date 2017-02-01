package practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num;
		int i;
		int c = 0;
		System.out.println("Enter the number :");
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
			
		}
		if(c == 2)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}
