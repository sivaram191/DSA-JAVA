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
		Scanner s = new Scanner(System.in);
		System.out.println("pls enter the sum");
		int sum=s.nextInt();
		int flag=0;
		int[] array = {133,32,44,4562,55,-34,67};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==sum)
				{
					flag++;
				}
			}
		}
		System.out.println("no of pairs with sum of"+" "+sum+" = "+flag);
			
	}
	
}
