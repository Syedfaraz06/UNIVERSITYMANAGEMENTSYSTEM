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
            String password="root";
            conn=DriverManager.getConnection(url,username,password);
            s=conn.createStatement();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new Conn();
    }
}
