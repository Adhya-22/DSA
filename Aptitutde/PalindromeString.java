class PalindromeString
{
	public static void main(String[] args)
	{
		String message="malayalam";
		String reverse="";
		
		for(int i=message.length()-1;i>=0;i--)
		{
			reverse+=message.charAt(i);
		}
		
		if(message.equals(reverse))
			System.out.println("The string is a Palindrome");
		else
			System.out.println("The string is not a Palindrome");
		
		//System.out.println(message==reverse);
	}
}