package day3;

import java.lang.*;
import java.util.*;
abstract class Shape
{
	int var1,var2;
	abstract void printmath();
}
class sum extends Shape
{
	sum(int a,int b)
	{
		var1=a;
		var2=b;
		printmath();
	}
	void printmath()
	{
		System.out.println("Sum  is "+(var1+var2));
	}
}
class sub extends Shape
{
	sub(int a,int b)
	{
	var1=a;
	var2=b;
	printmath();
	}
	void printmath()
	{
		System.out.println("difference is "+Math.abs(var1-var2));
	}
}
class mul extends Shape
{
	mul(int a,int b)
	{
		var1=a;
		var2=b;
		printmath();
	}
	void printmath()
	{
		System.out.println("Multiplication is "+(var1*var2));
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		sum test1=new sum(a,b);
		sub test2=new sub(a,b);
		mul test3=new mul(a,b);
		
	}
}
