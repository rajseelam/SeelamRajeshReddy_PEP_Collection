package EpamCollections;

import java.util.*;
import java.io.*;
public class Collections {
	
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
		
		Customize_list<Integer>li=new Customize_list<Integer>();
		System.out.println("No of Element in the list");
		int NoOfElements =sc.nextInt();
		for(int i=0;i<NoOfElements;i++)
		{
			System.out.println("Elements"+(i+1));
			int elements=sc.nextInt();
			li.addingElementsintoList(elements);
			
		}
		System.out.println("Total no of Elements");
		System.out.println(li);
		System.out.println("Enter Which element you want to print");
		System.out.println("Enter the fatch elements index");
		int index=sc.nextInt();
		System.out.println("The value at "+index+"index is:"+li.fetch(index));
		System.out.println("Enter the Remove element you Want");
		  int RemoveElement=sc.nextInt();
		  System.out.println(RemoveElement);
		System.out.println("After Remove of element"+RemoveElement+" in the List"+li);
			System.out.println("The Size of List is"+li.size());

}
}
