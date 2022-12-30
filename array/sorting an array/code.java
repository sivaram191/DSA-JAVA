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
		System.out.println("the sorted array ="+Arrays.toString(array));
	}
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
		System.out.println("the given array is = "+Arrays.toString(array));
		sortarray(array);
		
	}
	
}
