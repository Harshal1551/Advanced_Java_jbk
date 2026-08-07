package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

@Service
public class IPLService {
	
	@Autowired
	private IPLDao iplDao;

	public Player insertOnePlayer(Player player) {
		
		Player p1 = iplDao.insertOnePlayer(player);
		
		
		return p1;
	}

	public List<Player> getAllPlayers() {
		
		return iplDao.getAllPlayers();
	}

	public Player updatePlayer(Player player) {
		
		Player p1 = iplDao.updatePlayer(player);
		
		return p1;
	}
	
	 public String deletePlayer(int id) {

	        return iplDao.deletePlayer(id);
	    }

}
