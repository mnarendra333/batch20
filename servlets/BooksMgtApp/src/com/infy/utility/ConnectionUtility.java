package com.infy.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {
	
	private static Connection con = null;
	
	
	
	public static Connection getConnection(){
		
		
		if(con == null){
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "system");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return con;
			
	}

}
