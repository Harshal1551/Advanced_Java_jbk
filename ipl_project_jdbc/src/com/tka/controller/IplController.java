package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IplService;

public class IplController {

	public static void main(String[] args) {
		
		IplService iplservice = new IplService();
		
		List<Player> allplayer = iplservice.getAllPlayers();
		
		allplayer.forEach(p -> System.out.println(p.getPname()+"----->"+p.getJn()+"-----> "+p.getTname()+"--->"+p.getRuns()+"----->"+p.getWickets()));
		
		
		System.out.println();
		
		// GT Player 
		System.out.println("GT Players:");
		System.out.println("-----------------------------");
		 List<Player> gtPlayers = iplservice.getGTPlayers();

		 gtPlayers.forEach(System.out::println);

	     System.out.println();
	     
	     // RR Players 
	     System.out.println("RR Players:");
	     System.out.println("-----------------------------");
	     List<Player> rrPlayers = iplservice.getRRPlayers();
	        
	        
	     rrPlayers.forEach(System.out::println);
	     System.out.println();
	     
	     // For add player  
//	     Player p1 = new Player(104, "Hardik", 5000, 100, "MI");
//		  iplservice.addPlayer(p1);
		  
	//  allplayer.forEach(p -> System.out.println(p.getPname()+"-----> "+p.getTname()));
		 
	     
		 // For update runs
//		 iplservice.updateRuns(1, 900);
//		 allplayer.forEach(p -> System.out.println(p.getPname()+"-----> "+p.getTname()+"--->"+p.getRuns()));

		 
		 // For update wickets
//		 iplservice.updateWickets(99, 120);
//		 allplayer.forEach(p -> System.out.println(p.getPname()+"----->"+p.getJn()+"-----> "+p.getTname()+"--->"+p.getRuns()+"----->"+p.getWickets()));

		 
		 // delete player
//		 iplservice.deletePlayer(104);
//		 allplayer.forEach(p -> System.out.println(p.getPname()+"----->"+p.getJn()+"-----> "+p.getTname()+"--->"+p.getRuns()));

		 
	     
		 
	      
	        
	}

}
