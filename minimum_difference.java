package Inheritance;
import java.util.*;
public class p12
{
	public static void main(String args[])
			{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a=sc.nextLine();
		System.out.println("Enter word1: ");
		String word1=sc.nextLine();
		System.out.println("Enter word2: ");
		String word2=sc.nextLine();
		int w1=0;int w2=0; int res=999;
		String[] arr=a.split(" ");	
		int temp=0;
		for (int i=0;i<arr.length;i++)
		{

			{
			temp+=1;
			if(arr[i].equals(word1))
			{
				w1=temp;
			}
			else 
				{
				if(arr[i].equals(word2))
				
			{
				w2=temp;
			}
				}
			if(w1!=0 && w2!=0)
			{
				if(res>(w1-w2))
					
				{
					res=Math.abs(w1-w2);
				}
			}
			
			}
		}
		if(w1==0|| w2==0)
		{
		System.out.println("The given words is not in the String");
		}
		else
		{
		System.out.println(res+"\n");
		}
		
}
}
