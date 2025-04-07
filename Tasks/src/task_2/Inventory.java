package task_2;

import java.util.Arrays;
/*
write a java program to create a class called 'Inventory' with a collection of products and methods
to add and remove products, and to check for low inventory.
*/

public class Inventory
{
	String[] shirts = {"shirt-1", "shirt-2", "shirt-3"};
	String[] laptop = {"dell", "lenevo", "hp", "acer", "asus"};
	
	boolean lowInventory()
	{
		if(shirts.length <= 3)
		{
			System.out.println("there is not sufficient stock in the inventory");
		}
		return false;
				
	}
	
	void add()
	{
		shirts = Arrays.copyOf(shirts, shirts.length +1); //Expand the array size
		shirts[shirts.length - 1] = "shirt-4"; //add new element
		System.out.println("new stock added"); 
	}
	
	void remove()
	{
		
	}
	
	public static void main(String[] args)
	{
		Inventory manager = new Inventory();
		if(manager.lowInventory()==false)
		{
			manager.add();
			System.out.println(Arrays.toString(manager.shirts));
		}
	}

}
