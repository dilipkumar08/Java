import java.util.*;
public class SortSearch 
{
	Scanner sc=new Scanner(System.in);
	public int[] BubbleSort(int[] arr,int size)
	{
		for(int j=0;j<size;j++)
		 {
			for(int k=0;k<size-j;k++)
			{
				if(arr[j]>arr[k]);
				{
					int temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			 }
		 }
		return arr;
	}
	public int BinarySearch(int[] arr,int size,int target)
	{
		 int start=0;
		 int end=size-1;
		 int mid=0;
		 while(start<=end)
		 {
			mid=(start+end)/2;
			if (arr[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		 }
		return mid;
	}
	public static void main (String args[])
	{
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the size of the array:");
		 int size=sc.nextInt();
		 int[] arr=new int[size];
		 System.out.println("Enter the array:");
		 for (int i=0;i<size;i++)
		 { 
			 arr[i]=sc.nextInt();
			 
		 }
		 
		 System.out.println("\nEnter yes of the array is sorted No if not: ");
		 String s= sc.next();
		 
		 if (s.toLowerCase()=="yes")
		 {
			 SortSearch sort=new SortSearch();
			 sort.BubbleSort(arr, size);
		 }
		 System.out.println("Enter the target value:");
		 int target=sc.nextInt();		 System.out.println("Enter the target value:");
		 SortSearch bs=new SortSearch();
		 int mid=bs.BinarySearch(arr,size,target);
		 if(arr[mid]!=target)
		 {
			 System.out.println("The target value is not in the list");
		 }
		 else
		 {
			 System.out.println("The index of the target value is: "+ mid);
		 }
	}
}
