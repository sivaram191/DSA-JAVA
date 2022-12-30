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
		System.out.println("the given array is = "+Arrays.toString(array));
		for(int j=0;j<size/2;j++)
		{
			int temp = array[j];
			array[j]=array[size-1-j];
			array[size-1-j]=temp;			
		}System.out.print("the reverse array is = "+Arrays.toString(array));
		
	}
	
}
