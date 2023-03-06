
import java.util.*;
public class p4
{
public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);

System.out.println("Enter the Size of the array: ");
int size=sc.nextInt();
int arr[]= new int[size];
System.out.println("Enter the elements of the array: ");
for (int i=0;i<size;i++)
{
arr[i]=sc.nextInt();	
}

int res = 1;
for (int j:arr)
{
	res=res*j;
}
for(int k=0;k<size;k++)
{
	arr[k]=res/arr[k];
}
System.out.println(Arrays.toString(arr));
}
}
