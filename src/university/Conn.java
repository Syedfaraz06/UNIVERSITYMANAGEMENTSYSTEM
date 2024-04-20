package university;
import java.sql.*;
public class Conn {
    Connection conn;
    Statement s;
    Conn(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/universitymanagementsystem";
            String username="root";
            String password="S@l@udeen2002";
            conn=DriverManager.getConnection(url,username,password);
            s=conn.createStatement();
            System.out.println("Database created");
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new Conn();
    }
}
