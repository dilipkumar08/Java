package Day1;
import java.util.*;
import java.lang.*;
public class p11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Value: ");
		int val=sc.nextInt();
		double temp=Math.sqrt(val);
		if(temp>Math.round(temp))
		{
			System.out.println("\nIt is not a perfect Square");
		}
		else
		
		{
			System.out.println("\nIt is a perfect Square");
		}
		

	}

}
