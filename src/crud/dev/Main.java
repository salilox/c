package crud.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		  String url = "jdbc:xxx://"; // your database url 
		  String user = "username";  
		  String password = "password";
		  
		  ArrayList<City> city = new ArrayList<City>();
	    
		  Connection conn = DriverManager.getConnection(url, user, password);;
	        
	     
	        
        	Statement st = conn.createStatement() ;

        	
			ResultSet rs = st.executeQuery("CREATE TABLE City (" + 
					"	id serial PRIMARY KEY," +  
					"	name varchar(24) NOT NULL ,"+
					"	countryCode INTEGER NOT NULL," +
					"	district INTEGER NOT NULL," +
					"	population INTEGER NOT NULL," 
	
					);
			
		

	}

}
