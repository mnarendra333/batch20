package com.pragim.crud;

import java.sql.Connection;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] resp = null;
		try {
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			Statement stmt = connection.createStatement();
			
			stmt.addBatch("delete from empl where sal=80000");
			stmt.addBatch("insert into book values(24,'ThinkingInJava','James',780)");
			stmt.addBatch("update player set age=28 where id=1");
			
			resp = stmt.executeBatch();
			
			
			System.out.println(resp[0]+" "+resp[1]+" "+resp[2]);
			
			
			
		} catch (Exception e) {
			System.out.println(resp[0]+" "+resp[1]+" "+resp[2]);
			e.printStackTrace();
		}
	}

}
