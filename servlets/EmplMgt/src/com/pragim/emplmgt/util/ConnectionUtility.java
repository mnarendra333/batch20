package com.pragim.emplmgt.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {

	public static Connection getConFromOracle() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
