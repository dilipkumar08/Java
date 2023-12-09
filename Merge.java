import java.util.*;
import java.io.*;
public class Merge
{
    public static void main (String[] args)
    {
        int i=0,j=0,k=0;
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the size of the two arrays: ");
        int m=si.nextInt();
        int n=si.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        int[] res= new int[m+n];
        System.out.println("Enter the Values of Array1:");
        for( i=0;i<m;i++)
        {
            a[i]=si.nextInt();
        }
        System.out.println("Enter the Values of Array2:");
        for(j=0;j<n;j++)
        {
            b[j]=si.nextInt();

        }
        System.out.println(Arrays.toString(a));
        i=0;
        j=0;

        while(i<m && j<n)
        {
            if (a[i]>b[j])
            {
                res[k]=b[j];
                j++;
                k++;
            }
            else
            {
                res[k]=a[i];
                i++;
                k++;
            }
        }
        while(i<m)
        {
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<n)
        {
            res[k]=b[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
}
