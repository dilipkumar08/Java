import java.util.*;
import java.sql.*;
import java.lang.*;

class  Sort
{
    List<Integer> result = new ArrayList<>();
    Sort(int[] arr,int l) {
        int a;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {

                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        EliminateDuplicate(arr,l);
    }
        Sort(int [] arr)
        {
            int l=arr.length;
            int a;
            for (int i = 0; i < l - 1; i++)
            {
                for (int j = i + 1; j < l; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        a = arr[j];
                        arr[j] = arr[i];
                        arr[i] = a;
                    }
                }
            }
            EliminateDuplicate(arr,l);
        }

void EliminateDuplicate(int[]arr,int l) {

    int o = 0;
    List<Integer> res = new ArrayList<>();

    for (int u = 0; u < l; u++) {
        if (res.size() == 0) {
            res.add(arr[u]);
            o += 1;
        } else {
            if (res.get(o - 1) != arr[u]) {
                o += 1;
                res.add(arr[u]);
            }
        }

    }
    result=res;
}
        int [] Answer()
        {
        int []resArr=new int[result.size()];
        for (int k=0;k<result.size();k++) {
            resArr[k] = result.get(k);
        }
        return resArr;
    }

}
public class Main {

    public static void main(String [] args){
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
            for (int k = 0; k < size; k++)
            {
                arr[k] = sc.nextInt();
            }
            Sort oi=new Sort(arr);
            int [] res=oi.Answer();
            System.out.println(Arrays.toString(res));
            System.out.println("Bill ID numbers:"+Arrays.toString(arr));
            System.out.println("Bill ID Distinct:"+Arrays.toString(res));
            for (int j = 0; j < res.length; j++)
            {
                stmt.executeUpdate("INSERT INTO billing VALUES(" + (j + 1) + "," + res[j] + ")");
            }
            ResultSet rs=stmt.executeQuery("SELECT* FROM BILLING ");
            while(rs.next())
            {
                int sno=rs.getInt("SNO");
                int ids=rs.getInt("ID");
                System.out.println("SNO:"+sno+"    "+"ID:"+ids);

            }
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
