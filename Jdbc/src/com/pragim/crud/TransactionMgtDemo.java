package com.pragim.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionMgtDemo {

	public static void main(String[] args) {
		
		
		Connection connection = null;
		int[] resp = null;
		int i1=0,i2=0,i3=0;
		try {
			connection = ConnectionUtility.getConnectionFromOracle();
			Statement stmt = connection.createStatement();
			
			//set autocommit as false
			
			connection.setAutoCommit(false);
			
			
			i1 = stmt.executeUpdate("delete from empl where id=106");
			i2 = stmt.executeUpdate("insert into book values(25,'ThinkingInJava','James',780)");
			i3 = stmt.executeUpdate("update player1 set age=26 where id=1");
			
			//step-2
			connection.commit();
			
			System.out.println(i1+" "+i2+" "+i3);
			
			
			
		} catch (Exception e) {
			try {
				//step-3
				System.out.println(i1+" "+i2+" "+i3);
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(i1+" "+i2+" "+i3);
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
