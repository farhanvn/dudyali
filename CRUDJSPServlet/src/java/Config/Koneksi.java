
package Config;
import java.sql.Connection; 
import java.sql.DriverManager;

public class Koneksi {
     public Connection openConnection(){         
         Connection con;         
         try          
         {             
             Class.forName("com.mysql.jdbc.Driver");             
             String url = "jdbc:mysql://localhost:3306/belajar_adp ";             
             con = DriverManager.getConnection(url, "farhan", "farhanganteng");             
             return con;         
         }          
         catch (Exception e) {            
             System.err.println(e);             
             return null;         
         }     
     } 
}



