package practice;

public class Add2 {

	public static void main(String[] args) {
		
		int i;
		int sum =0;
		
		for(i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

	}

}
