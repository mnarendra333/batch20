package com.pragim.crud;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadPic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		try {
			
			Connection con = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = con.prepareStatement("select profile_pic from person_tab where id=?");
			pstmt.setInt(1, 101);
			ResultSet rs = pstmt.executeQuery();
			
			FileOutputStream fos = new FileOutputStream(new File("target.jfif"));
			/*if(rs.next()) {
				is = rs.getBinaryStream(1);
				int k=0;
				while((k=is.read())!=-1){
					fos.write(k);
				}
				System.out.println("file copied");
			}*/
			
			if(rs.next()) {
				Blob blob = rs.getBlob("profile_pic");
				byte[] bytes = blob.getBytes(1, (int)blob.length());
				fos.write(bytes);
				System.out.println("file copied");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
