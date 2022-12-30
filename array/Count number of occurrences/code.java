package java_dsa;

import java.util.*;
public class Java_dsa
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] array1 = {1,3,4,1,2,5};
		int flag=0;
		System.out.println("enter the number to know it's frequency");
		int num = s.nextInt();
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==num)
			{
				flag++;
			}
		}
		System.out.println("it occured"+" "+flag+" "+"times");
			
	}
	
}
