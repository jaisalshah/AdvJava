package sycs64;

import java.sql.*;

public class Aj1 {

    public static void main(String[] args) {
        
        String DB_URL = "jdbc:mysql://127.0.0.1:3306/advjava";
        try {
            Connection con = DriverManager.getConnection(DB_URL, "root", "scott");
            System.out.println("Connected");
            Statement stmt = con.createStatement();
//            stmt.execute(" create table stud (id int,name varchar(10));");
            stmt.execute("insert into stud values (3,'java233')");
            ResultSet rs = stmt.executeQuery("select * from stud");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
