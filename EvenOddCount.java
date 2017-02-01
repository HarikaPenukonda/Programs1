package practice;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		
		int i;
		int num;
		int count=0;
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println("The numbers are "+i);
			}
		}
		
	
	System.out.println("the number of even numbers are "+count);

	}

}
