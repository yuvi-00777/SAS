import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/data1";
    static final String USER = "root";
    static final String PASS = "ssneeraj23";
 
    public static void main(String[] args) {
       // Open a connection
       try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
       ) {		      
         System.out.println("Databas connected created successfully..."); 
         Login l=new Login();
         l.setVisible(true);
         // newproduct n=new newproduct();
         // n.setVisible(true);
       } catch (SQLException e) {
          e.printStackTrace();
       } 
    }
}
