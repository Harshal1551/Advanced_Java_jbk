package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IplDao {
	
	private List<Player> ipl_db = null;
	
	String path = "com.mysql.cj.jdbc.Driver";
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;  
	
	String url = "jdbc:mysql://localhost:3306/adv_java";
	String un = "root";
	String pwd = "123456";
	
	String query = "Select * from player";
	
	public List<Player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url, un, pwd);
			pst = conn.prepareStatement(query);
			
			rs = pst.executeQuery(); 
			
			ipl_db = new ArrayList<Player>();
			
			while(rs.next()) {
				
				int jn = rs.getInt(1);
				String pn = rs.getString(2);
				int r = rs.getInt(3);
				int w = rs.getInt(4);
				String tn = rs.getString(5); 
				
				Player obj = new Player(jn, pn, r, w, tn);
				
				ipl_db.add(obj);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return ipl_db;
	}
	
	// For add new player
	public int addPlayer(Player p) {

        String query = "insert into player values(?,?,?,?,?)";

        try {

            Class.forName(path);

            conn = DriverManager.getConnection(url, un, pwd);

            pst = conn.prepareStatement(query);

            pst.setInt(1, p.getJn());
            pst.setString(2, p.getPname());
            pst.setInt(3, p.getRuns());
            pst.setInt(4, p.getWickets());
            pst.setString(5, p.getTname());

            return pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
	
	
	public int updateRuns(int jerseyNo, int runs) {

        String query = "update player set runs=? where jn=?";

        try {

            Class.forName(path);

            conn = DriverManager.getConnection(url, un, pwd);

            pst = conn.prepareStatement(query);

            pst.setInt(1, runs);
            pst.setInt(2, jerseyNo);

            return pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    // For Update Wickets
    public int updateWickets(int jerseyNo, int wickets) {

        String query = "update player set wickets=? where jn=?";

        try {

            Class.forName(path);

            conn = DriverManager.getConnection(url, un, pwd);

            pst = conn.prepareStatement(query);

            pst.setInt(1, wickets);
            pst.setInt(2, jerseyNo);

            return pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    //For Delete Player
    public int deletePlayer(int jerseyNo) {

        String query = "delete from player where jn=?";

        try {

            Class.forName(path);

            conn = DriverManager.getConnection(url, un, pwd);

            pst = conn.prepareStatement(query);

            pst.setInt(1, jerseyNo);

            return pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
    
    
    
    public Player searchPlayer(int jerseyNo) {

        String query = "select * from player where jn=?";

        try {

            Class.forName(path);

            conn = DriverManager.getConnection(url, un, pwd);

            pst = conn.prepareStatement(query);

            pst.setInt(1, jerseyNo);

            rs = pst.executeQuery();

            if (rs.next()) {

                return new Player(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
    
    
}
