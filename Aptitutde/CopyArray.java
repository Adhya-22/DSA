public class CopyArray 
{
    public static void main(String[] args) 
	{
        String[] names = {"Adhya", "Rahul", "Sneha", "Arjun"};

        String[] selectedNames = new String[3];

        System.arraycopy(names, 0, selectedNames, 0, 3);

        System.out.println("Selected Names:");
        for (String name : selectedNames) 
		{
            System.out.println(name);
        }
    }
}