import java.util.Scanner;
public class Main
{
    static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    static void sum(int d,int e)
    {
        System.out.println(d+e);
    }
    static void sum(int f,int g,int h,int i)
    {
        System.out.println(f+g+h+i);
    }
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=inp.nextInt();
        System.out.println("Enter the value of b:");
        b=inp.nextInt();
        System.out.println("Enter the value of c:");
        c=inp.nextInt();
        sum(a,b);
        sum(a,b,c);
    }
}
