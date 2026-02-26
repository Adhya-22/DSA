import java.util.Arrays;

class SumOfEvenAndOddInArray
{
	static int[] SumOfEvenAndOddInArray(int arr[])
	{
		int evenSum=0;
		int oddSum=0;
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]%2==0)
				evenSum+=arr[index];
			else
				oddSum+=arr[index];
		}
		
		return new int[]{evenSum,oddSum};
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4};
		System.out.println(Arrays.toString(SumOfEvenAndOddInArray(arr)));
	}
}