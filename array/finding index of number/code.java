package java_dsa;

import java.util.*;
public class Java_dsa
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = s.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		/*for(int j=0;j<size;j++)
		{
			System.out.println(array[j]);
		}*/
		System.out.println("enter the number to search it's index");
		int temp = s.nextInt();
		for(int j=0;j<size;j++)
		{
			if(array[j]==temp)
			{
				System.out.print("number found at index = ");
				System.out.println(j);
			}
			
		}
	
	}
	
}
