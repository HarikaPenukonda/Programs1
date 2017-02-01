package practice;

import java.util.Scanner;

//even numbers between 1 to n

public class EvenOdd {

	public static void main(String[] args) {
		
		int i;
		int num;
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
