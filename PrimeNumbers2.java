package practice;

import java.util.Scanner;

//Prime numbers between given numbers

public class PrimeNumbers2 {

	public static void main(String[] args) {

		int i;

		int j;
		int number;
		
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (i = 1; i <= number; i++) 
		{
			int count =0;
			
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.println(i);
			}
			
		}
		
		

	}

}
