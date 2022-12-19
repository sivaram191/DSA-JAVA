import java.util.*;
import java.io.*;

public class push_operation
{
	static void push(Stack<Integer> stack)
	{
		for(int i=0;i<=5;i++)
		{
			stack.push(i);
		}
		System.out.println(stack);
	}
	public static void main (String[] args)
	{
		Stack<Integer> stack= new Stack<Integer>();
		push(stack);
	}
}
