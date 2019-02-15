package com.pragim.dao;

import java.util.List;

import com.pragim.model.Players;
import com.pragim.model.Teams;

public interface CrickInfoDao {
	
	
	public List<Teams> getTeamsInfo();
	public List<Players> getPlayersInfo();

}
