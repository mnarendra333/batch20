package com.pragim.crud;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("insert into person_tab values(?,?,?)");
			System.out.println("Enter person dataa");
			Scanner scanner = new Scanner(System.in);
			int no = scanner.nextInt();
			String name = scanner.next();
			File file = new File("C:\\Users\\sapuser\\Pictures\\image1.jfif");
			long length = file.length();
			FileInputStream fis = new FileInputStream(file);
			
			
			
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setBinaryStream(3, fis, length);
			
			int count = pstmt.executeUpdate();
			if(count>0)
				System.out.println(count+" rows effected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
