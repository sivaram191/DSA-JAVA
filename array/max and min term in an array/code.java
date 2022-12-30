package java_dsa;

import java.util.*;
public class Java_dsa
{
	public static void sortarray(int[] array)
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;	
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		
		int[] array1 = {133,32,44,4562,55};
		sortarray(array1);
		System.out.println("max number in array = "+array1[array1.length-1]);
		System.out.println("min number in array = "+array1[0]);
		
			
	}
	
}
