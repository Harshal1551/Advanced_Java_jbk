package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IplService;

public class IplController {

	public static void main(String[] args) {
		
		IplService iplservice = new IplService();
		
		List<Player> allplayer = iplservice.getAllPlayers();
		
		allplayer.forEach(p -> System.out.println(p.getPname()));
		
		
		System.out.println();
		
		System.out.println("GT Players:");
		System.out.println("-----------------------------");
		 List<Player> gtPlayers = iplservice.getGTPlayers();


	        gtPlayers.forEach(System.out::println);
	        
	}

}
