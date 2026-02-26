import java.util.Arrays;

class SumOfEvenAndOddIndex
{
	static int[] SumOfEvenAndOddIndex(int arr[])
	{
		int evenSum=0;
		for(int index=0;index<arr.length;index+=2)
		{
			evenSum+=arr[index];
		}
		
		int oddSum=0;
		for(int index=1;index<arr.length;index+=2)
		{
			oddSum+=arr[index];
		}
		
		return new int[]{evenSum,oddSum};
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4};
		System.out.println(Arrays.toString(SumOfEvenAndOddIndex(arr)));
		
	}
}