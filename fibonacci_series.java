 import java.util.Scanner;
 public class Main
 {
    static int fibno(int n)
    {
        if (n<=1)
        {
            return n;
        }
        return fibno(n-1)+fibno(n-2);
    }
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the size of the series:");
        int n=inp.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(fibno(i));
        }
        
    }
 }
