import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int [] EliminateDuplicate(int[] arr)
    {
        int l=arr.length-1;
        List<Integer> res = new ArrayList<>();
        int a=0;
        for(int i=0;i<l;i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println(arr[i] + " " + arr[j]);
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for(int u=0;u<l;u++)
        {
            if(res.size()==0)
            {
                res.add(arr[u]);
            }
            else
            {
                if (res.get(u-1)!=arr[u]);
                {
                    res.add(arr[u]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int []resArr=new int[res.size()];
        for (int k=0;k<res.size();k++)
        {
            resArr[k]=res.get(k);
        }
        return resArr;
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array: ");
        for(int k=0;k<size;k++)
        {
            arr[k]=sc.nextInt();
        }
    	System.out.println(Arrays.toString(EliminateDuplicate(arr)));
    }
}
