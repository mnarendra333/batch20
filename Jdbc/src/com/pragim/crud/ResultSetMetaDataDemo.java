package com.pragim.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			Statement stmt = connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Table name");
			String tableName = sc.next();
			ResultSet rs = stmt.executeQuery("select * from "+tableName);
		
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.print(rsmd.getColumnName(i)+"\t"+" "+rsmd.getColumnTypeName(i)+"("+rsmd.getColumnDisplaySize(i)+")");
			System.out.println();
			
			
			while (rs.next()) {
				
				for(int i=1;i<=rsmd.getColumnCount();i++){
					
					if(rsmd.getColumnTypeName(i).equalsIgnoreCase("varchar2"))
						System.out.print(rs.getString(i)+"\t");
					else if(rsmd.getColumnTypeName(i).equalsIgnoreCase("number"))
						System.out.print(rs.getInt(i)+"\t");
					else if(rsmd.getColumnTypeName(i).equalsIgnoreCase("float"))
						System.out.print(rs.getInt(i));
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
