
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		System.out.println("Palindrome checker");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		boolean res=true;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-(i+1)))
			{
				System.out.println("Not a palindrome");
				res=false;
				break;
			}
			else
			{
				res=true;
			}
		}
		if(res)
		{
			System.out.println("It is a palindrome");
		}
	}
}
