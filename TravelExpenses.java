import java.util.*;
import java.sql.*;
import java.lang.*;
public class budget {
    public static void main(String [] args) 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
            System.out.println("Connected successfully....");
            Statement stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of days: ");
            int days = sc.nextInt();
            int[] food = new int[days];
            int[] boarding = new int[days];
            int[] entertainment = new int[days];
            int[] expense = new int[days];
            int[] total = new int[days];
            for (int i = 0; i < days; i++) {
                System.out.println("Food expense for day " + (i + 1) + " :");
                food[i] = sc.nextInt();
                System.out.println("Boarding expense for day " + (i + 1) + " :");
                boarding[i] = sc.nextInt();
                System.out.println("Entertainment expense for day " + (i + 1) + " :");
                entertainment[i] = sc.nextInt();
                expense[i] = food[i] + boarding[i] + entertainment[i];
                try {
                    total[i] = expense[i] + total[i - 1];
                } catch (Exception e) {
                    total[i] = expense[i];
                }
            }
            for (int j = 0; j < days; j++) {
                System.out.println(j);
                    stmt.executeUpdate("INSERT INTO project6 VALUES(" + (j + 1) + "," + food[j] + "," + boarding[j] + "," + entertainment[j] + "," + expense[j] + "," + total[j] + ")");
            }
            ResultSet rs=stmt.executeQuery("SELECT* FROM project6 ");
            rs.close();
            stmt.close();
        }
        catch(Exception e)
            {
                e.printStackTrace();
            }

        }
    }


