package Day1;
import java.util.Scanner;


public class p8 {
	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a = sc.nextInt();
		System.out.println("Enter the next value");
		int b = sc.nextInt();
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println("The Greatest common divisor of the given number is : "+b);
		
		
	}

}
