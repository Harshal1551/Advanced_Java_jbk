package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Player;
import com.tka.service.IPLService;

@RestController
public class IPLController {
	
	@Autowired
	private IPLService iplservice;
	
	@PostMapping("/insert-one-player")
	public Player insertOnePlayer(@RequestBody Player player) {
		
		Player p1 = iplservice.insertOnePlayer(player);
		
		return p1;
	}
	
	@GetMapping("/allplayers")
	public List<Player> getAllPlayers() {
		
		List<Player> p1 = iplservice.getAllPlayers();
		
		return p1;
	}
	
	@PutMapping("/update-player")
	public Player updatePlayer(@RequestBody Player player) {
		
		Player p1 = iplservice.updatePlayer(player);
		
		return p1;
		
	}
	
	@DeleteMapping("/delete-player/{id}")
	public String deletePlayer(@PathVariable int id) {
		
		
		return iplservice.deletePlayer(id);
	}
	
	

}
