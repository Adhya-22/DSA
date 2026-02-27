class SumUsingForEach 
{
	static int SumUsingForEach(int[] numbers)
	{
		int sum=0;
        for(int num:numbers)
		{   
            sum=sum+num;
        }
		return sum;
	}
	
    public static void main(String[] args) 
	{
        int[] numbers = {1,2,3,4,5};
        System.out.println("Sum = "+SumUsingForEach(numbers));
    }
}