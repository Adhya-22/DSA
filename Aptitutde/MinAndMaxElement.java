class MinAndMaxElement 
{
	public static int minElement(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	public static int maxElement(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {68,50,47,25,17,39,11,21};
		System.out.println("Min Element : "+minElement(arr));
		System.out.println("Max Element : "+maxElement(arr));
	}

}