package Day1;
import java.util.Scanner;
import java.lang.Math;
public class p6 {

	public static void main(String[] args) {
		System.out.println("Armstrong Number Checker");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		int val= sc.nextInt();
		int count=0;
		int res=0;
		int temp=val;
		while(temp!=0)
		{
			temp=temp/10;
			count+=1;
		}
		temp=val;
		while (temp!=0)
		{
			int temp1=temp%10;
			res+=Math.pow(temp1,count);
			temp=temp/10;
		}
		if(val==res)
		{
			System.out.println("It is a Armstrong Number");
		}
		else
		{
			System.out.println("It is not a Armstrong Number");
		}

	}

}
