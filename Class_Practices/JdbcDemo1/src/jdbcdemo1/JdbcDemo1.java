package jdbcdemo1;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo1 {
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("driver loaded");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava", "root", "ajay");
           System.out.println("connection established");
           Scanner s = new Scanner(System.in);
           System.out.println("Enter rollno,marks");
         //  String n = s.nextLine();
           int r = s.nextInt();
           int m = s.nextInt();
           
           //   update Query
           PreparedStatement ps = conn.prepareStatement("update student set marks=? where en_no=?");
           ps.setInt(1, m);
           ps.setInt(2, r);
           System.out.println(ps.executeUpdate());
           
           /*
                //Insert query
           PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
           ps.setInt(1, r);
           ps.setString(2,n);
           ps.setInt(3, m);
           System.out.println(ps.executeUpdate());*/
           
           /*   //data retrive from data base
           PreparedStatement ps = conn.prepareStatement("select * from student where name =?");
           ps.setString(1, n);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               System.out.println(rs.getInt("en_no")+" "+rs.getString("name")+" "+rs.getInt("marks"));
           }*/
       }
       catch (Exception e){
           System.out.println(e);
       }
    }
    
}
