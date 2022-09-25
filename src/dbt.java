
import java.sql.Connection;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//import java.sql.Statement;

//import java.sql.ResultSet;
import java.util.Date;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
  
public class dbt {
    public static Connection Connecdb()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
            System.out.println("connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
