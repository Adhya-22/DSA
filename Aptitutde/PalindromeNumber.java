class PalindromeNumber
{
	static void isPalindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		
		if(rev==temp)
			System.out.println("The given number is a Palindrome.");
		else
			System.out.println("The given number is not a Palindrome.");
	}
	
	public static void main(String[] args)
	{
		isPalindrome(121);
		isPalindrome(122);
	}
}