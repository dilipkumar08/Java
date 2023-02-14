import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String s2=sc.next();
                int y=sc.nextInt();
                String s3=sc.next();
                int z=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);                
                System.out.printf("%-15s%03d\n", s2, y);
                System.out.printf("%-15s%03d\n", s3, z);
            }   System.out.println("================================");
            
    }
}



 
