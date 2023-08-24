
package studentmanage;

import java.sql.*;

public class Stuconnection {
    Connection con;
    Statement stm;
    Stuconnection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Siyaram@11@11");
            stm=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] ar){
        new Stuconnection();
    }
}
