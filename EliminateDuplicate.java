import java.util.*;
import java.sql.*;
import java.lang.*;
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

    public static void main(String [] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/project1";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully....");
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the size of the Array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements for the array: ");
            for (int k = 0; k < size; k++) {
                arr[k] = sc.nextInt();
            }
            int[] res = EliminateDuplicate(arr);
            for (int j = 0; j < res.length; j++) {
                stmt.executeUpdate("INSERT INTO billing VALUES(" + (j + 1) + "," + res[j] + ")");
            }
            ResultSet rs=stmt.executeQuery("SELECT ID FROM BILLING ");
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
