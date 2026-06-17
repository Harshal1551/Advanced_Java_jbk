package com.tka.service;

import java.util.List;
import java.util.stream.Collectors;

import com.tka.dao.IplDao;
import com.tka.entity.Player;

public class IplService {
	
	private List<Player> ipl_db = null;
	private IplDao ipldao = null; 

	public List<Player> getAllPlayers(){
		
		ipldao = new IplDao();
		
		ipl_db = ipldao.getAllPlayer();
	
		return ipl_db;
		
	}
	
	
	public List<Player> getGTPlayers() {

        List<Player> allPlayers = ipldao.getAllPlayer();

        return allPlayers.stream()
                .filter(player -> player.getTname().equalsIgnoreCase("GT"))
                .collect(Collectors.toList()); 
        
    }
	
	
}
