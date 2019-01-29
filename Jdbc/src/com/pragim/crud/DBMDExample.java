package com.pragim.crud;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DBMDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			DatabaseMetaData dbmd = connection.getMetaData();
			
			System.out.println(dbmd.getMaxColumnsInTable());
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getMaxConnections());
			System.out.println(dbmd.getMaxTableNameLength());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
