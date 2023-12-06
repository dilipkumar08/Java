import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Scanner inp=new Scanner(System.in);
    int i=1;
    while (i==1)
    {
    System.out.println("\nEnter the year: ");
    int a=inp.nextInt();
    if(((a%4==0) && (a%100!=0)) || (a%400==0))
    {
        System.out.println("\nThe given year is a leap year");
    }
    else
    {
        System.out.println("\nThe given year is not a leap year");
    }

    System.out.println("\nIf you want to try once again enter 1 else enter 0 :");
    i=inp.nextInt();
    while((i!=1) &&(i!=0))
    {
        System.out.println("\nPlease enter a valid option (1 or 0) :");
        i=inp.nextInt();
    }
    }
    }
}
