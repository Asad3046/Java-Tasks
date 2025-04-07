package task_1;
/*
Write a program to remove white spaces in a given string.  
*/
public class Program_01
{
	
	public static void main(String[] args)
	{
		String str = "Java is most demanding language";
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

}
