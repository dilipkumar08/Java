package Day1;
import java.util.Arrays;
import java.util.Scanner;
public class p9 {
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		while(n<=1)
		{
			if(n==0)
			{
				System.out.println("The array can't be empty");
				System.out.print("\n\nEnter the size of the array: ");
				n=sc.nextInt();
			}
			if(n==1)
			{
				System.out.println("The minimum size of the has to be 2");
				System.out.print("\n\nEnter the size of the array: ");
				n=sc.nextInt();
			}
			else
			{
				System.out.println("The size of the array can't be negative");
				System.out.print("\n\nEnter the size of the array: ");
				n=sc.nextInt();
			}
		}
		int [] arr=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			
			arr[i]= sc.nextInt();
			
		}
		if (n==2)
		{
			if (arr[0]>arr[1])

			{
				System.out.println("The second largest number is: "+arr[1]);	
			}
			else
			{
				System.out.println("The second largest number is: "+arr[0]);
			}

		}
		else
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n-j - 1;k++)
				{
					if (arr[k]<arr[k+1])
					{
						int temp=arr[k+1];
						arr[k+1]=arr[k];
						arr[k]=temp;
					}
					
				}
				
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("The second largest is: "+arr[1]);
		}
	}
}
