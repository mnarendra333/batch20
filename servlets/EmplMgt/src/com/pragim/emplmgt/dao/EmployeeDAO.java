package com.pragim.emplmgt.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pragim.emplmgt.util.ConnectionUtility;

public class EmployeeDAO {
	
	
	
	public ResultSet getEmployeeList(){
		ResultSet rs = null;
		try {
			Connection con = ConnectionUtility.getConFromOracle();
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from empl");
		} catch (Exception e) {
			e.printStackTrace();		}
		
		return rs;
	}

}
