package task_2;

/*
You are given a string s consisting of multiple words. You need to count the total words in the
string. words are seperated by a single space.
*/
public class StringOne
{
	public static void main(String[] args)
	{
		String str = "Java is a pure object oriented language";
		String[] array=str.split(" ");
		System.out.println(array.length);
	}

}

