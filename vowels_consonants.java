import java.util.Scanner;
public class p1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		for(int x=0;x<s.length();x++)
		{
			String a=s.charAt(x)+"".toLowerCase();
			if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u"))
			{
			System.out.println("vowel: " + a);
		    }
			else
			{
				System.out.println("Consonants: "+a);
			}

	    }
     }
}
