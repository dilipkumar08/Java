package Day1;
import java.util.Scanner;
public class p10 {

	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the first Value: ");
	int a=sc.nextInt();
	System.out.print("\nEnter the Second value: ");
	int b=sc.nextInt();
	System.out.print("\nEnter the third value: ");
	int c=sc.nextInt();
	int res=0;
	res=(a>b)?a:b;
	res=(res>c)?res:c;
	System.out.print("\nThe largest integer is: "+res);
	
	
	}
}
