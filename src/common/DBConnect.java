package common;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnect {	
	 public  static Connection getConnection() {
	        Connection connect = null;
	        try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName = ManageMachine;username =sa;password =123";
	            // them dau "\" tai: \\MAIVANTU
	            //  //300-FRS-V272\\MAIVANTU or //localhost:1433
	            connect = DriverManager.getConnection(connectionURL);
	        } catch (Exception e) {
	            e.printStackTrace();         
	        }
	        return connect;
	    }

	    public static void main(String[] args) {        
	        Connection con = DBConnect.getConnection();
	        if(con!=null){
	            System.out.println("Connect success!");
	        }else{
	            System.out.println("Connect fail!");
	        }
	    }
}
