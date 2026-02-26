class ReverseString
{
	static String ReverseString(String message)
	{
		String reverse="";
		
		for(int i=message.length()-1;i>=0;i--)
		{
			reverse+=message.charAt(i);
		}
		
		return reverse;
	}
	
	public static void main(String[] args)
	{
		String message="Hello";
		System.out.println(ReverseString(message));
	}
}
