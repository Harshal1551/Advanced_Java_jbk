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
	
	public List<Player> getRRPlayers() {
		
		List<Player> allPlayers = ipldao.getAllPlayer();
		
		return allPlayers.stream()
				.filter(player -> player.getTname().equalsIgnoreCase("RR"))
				.collect(Collectors.toList()); 
		
	}
	
	
	//For Add Player
		public int addPlayer(Player p) {
			ipldao = new IplDao();
			return ipldao.addPlayer(p);
		}

		//For Update Runs
		public int updateRuns(int jerseyNo, int runs) {
			ipldao = new IplDao();
			return ipldao.updateRuns(jerseyNo, runs);
		}

	   //For Update Wickets
		public int updateWickets(int jerseyNo, int wickets) {
			ipldao = new IplDao();
			return ipldao.updateWickets(jerseyNo, wickets);
		}

		
		//For Delete Player
		public int deletePlayer(int jerseyNo) {
			ipldao = new IplDao();
			return ipldao.deletePlayer(jerseyNo);
		}


		
	
}
