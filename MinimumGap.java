import java.lang.Math;
import java.util.*;
class Service
{
	int result(int a[])
	{
		int l=a.length;
		int res=-1;
		int [] diff=new int[l];
		if (l<2)
		{
			return 0;
		}
		else
		{
			for(int i=0;i<l-1;i++)
			{
				diff[i]=Math.abs(a[i+1]-a[i]);
				if (res<0 || res>diff[i])
				{
					res=diff[i];
				}
			}
		}
		return res;
	}
}
public class MinimumGap {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the array:");
	int size=sc.nextInt();
	int []inp =new int[size];
	System.out.println("Enter the elements for the array:");
	for(int j=0;j<size;j++)
	{
		inp[j]=sc.nextInt();
	}
	Service p=new Service();
	System.out.println("The minimum difference is: "+p.result(inp));
}
}
