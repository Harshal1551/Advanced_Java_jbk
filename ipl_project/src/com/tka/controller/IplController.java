package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IplService;

public class IplController {

	public static void main(String[] args) {
		
		IplService iplservice = new IplService();
		
		List<Player> allplayer = iplservice.getAllPlayers();
		
		allplayer.forEach(p -> System.out.println(p.getPname()));

	}

}
