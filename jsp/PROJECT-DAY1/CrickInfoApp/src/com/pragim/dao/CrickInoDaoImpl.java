package com.pragim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pragim.model.Players;
import com.pragim.model.Teams;
import com.pragim.utility.ConnectionUtility;

public class CrickInoDaoImpl implements CrickInfoDao {

	@Override
	public List<Teams> getTeamsInfo() {
		
		Connection connection = ConnectionUtility.getConnectionFromOracle();
		List<Teams> teamList = null;
		try {
			
			PreparedStatement pstmt = connection.prepareStatement("select * from teams");
			ResultSet rs = pstmt.executeQuery();
			teamList = convertRsIntoList(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return teamList;
	}

	private List<Teams> convertRsIntoList(ResultSet rs) {
		
		List<Teams> list = new ArrayList<Teams>();
		try {
			while (rs.next()) {
				Teams teamObj = new Teams(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
				list.add(teamObj);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public List<Players> getPlayersInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
