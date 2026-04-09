class ReverseArray
{
	public static void reverseArray(int[] arr)
	{
		for(int index=arr.length-1;index>=0;index--)
		{
			System.out.print(arr[index]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={23,45,13,47,89,56};
		reverseArray(arr);
	}
}