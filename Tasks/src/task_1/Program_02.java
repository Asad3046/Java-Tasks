package task_1;

/*
How to count the number of occurence of each character in a given string
*/
public class Program_02
{
	
	public static void main(String[] args)
	{
		String str = "Examination was completed successfully";
		
		int count = 0;
		boolean hasDuplicate = false;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i + 1; j < str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j));
				hasDuplicate = true;
				count = count+1;
			}
			System.out.println(i);
			if(hasDuplicate == true)
			{
				System.out.println(str);
			}
			
		}
	}

}
