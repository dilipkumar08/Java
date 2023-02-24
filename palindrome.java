package Day1;
import java.util.Scanner;

public class p5 
{

	public static void main(String[] args) 
	{
		
		System.out.println("palindrome checker\n");
		System.out.println("Enter the word:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length()-1;
		if(l%2==1)
		{
			s=s.toLowerCase();
			
			boolean res=true;
			for(int i=0;i<=l;i++)
			{

				if(s.charAt(i)!=s.charAt(l-i))
					{
						res=false;
					}
			}
			if(res)
			{
				System.out.println("The given word is a palindrome");
			}
			else
			{
				System.out.println("The given word is not a palindrome");
			}
		}
		else
		{
			System.out.println("The given word is not a palindrome");
		}
	}

}
