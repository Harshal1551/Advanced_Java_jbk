package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tka.entity.Player;

@Repository
@Transactional
public class IPLDao {

    @Autowired
    private SessionFactory sessionFactory;

    
    
    public Player insertOnePlayer(Player player) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(player);
        session.getTransaction().commit();
        session.close();
        return player;
    }
    
    

	public List<Player> getAllPlayers() {
		
		 Session session = sessionFactory.openSession();
		
		 Query<Player> query = session.createQuery("from Player", Player.class);
		 List<Player> resultList = query.getResultList();
		 
		 session.close();
		 
		return resultList;
	}




	public Player updatePlayer(Player player) {
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.merge(player);
		
		session.getTransaction().commit();
		
		session.close();
		return player;
	}



	public String deletePlayer(int id) {
		Session session = sessionFactory.openSession();

        session.beginTransaction();

        Player player = session.find(Player.class, id);
        
        session.remove(player);

        session.getTransaction().commit();

        session.close();
 
		return "Player Deleted Successfully";
	}
	
	
	
	
	
	
	
}
