package practice;


//Addition of 2,4,6,8...100
public class Add1 {

	public static void main(String[] args) {
		
		
		int i;
		int sum=0;
		
		for(i=1;i<=200;i++)
		{
			if(i%2==0)
			{
				sum = sum+i;
			}
				
		}
		System.out.println(sum);
		
	}

}
