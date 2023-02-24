package Day1;
import java.util.Scanner;
public class p4
{
	public static void main(String args[])
	{
		int sum=0;
		int temp=1;
	System.out.println("Factorial");
	
	System.out.println("Enter a value: ");
	Scanner sc=new Scanner(System.in);
	int val=sc.nextInt();
	for(int i=val;i>=1;i--)
	{
		System.out.println("i "+i+" temp "+temp);
		temp=i*temp;
		
	}
	System.out.println("Factorial of the given value: "+temp);
	}
}
