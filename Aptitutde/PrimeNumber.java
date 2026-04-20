import java.util.Scanner;

public class PrimeNumber 
{
	public static boolean isPrime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)     //started from 2 because 1 is factor of all number
		{
			if(n%i==0)
			{
				count++;	
				break;           //to reduce iterations, even if count increase by one it is not a prime num
			}
		}
		return count==0;  //
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		System.out.println(isPrime(n));
		
	}

}