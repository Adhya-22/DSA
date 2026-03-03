class WordLength
{
	static void wordLength(String[] str)
	{
		for(String word : str)
		{
			System.out.println("length of the word : "+word.length());
			if(word.length()>4)
				System.out.println("The word : "+word);
		}
	}
	
	public static void main(String[] args)
	{
		String[] str={"Adhya","has","hello","Kitty"};
		wordLength(str);
	}
}