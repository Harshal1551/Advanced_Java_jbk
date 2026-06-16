package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IplDao {
	
	private List<Player> ipl_db = null;
	
	public List<Player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		ipl_db.add(new Player(18, "Virat Kohli", 741, 0, "RCB"));
		ipl_db.add(new Player(28, "Phil Salt", 487, 0, "RCB"));
		ipl_db.add(new Player(97, "Rajat Patidar", 412, 0, "RCB"));
		ipl_db.add(new Player(37, "Devdutt Padikkal", 365, 0, "RCB"));
		ipl_db.add(new Player(55, "Jitesh Sharma", 289, 0, "RCB"));
		ipl_db.add(new Player(6, "Krunal Pandya", 210, 15, "RCB"));
		ipl_db.add(new Player(8, "Tim David", 255, 0, "RCB"));
		ipl_db.add(new Player(15, "Bhuvneshwar Kumar", 75, 14, "RCB"));
		ipl_db.add(new Player(38, "Josh Hazlewood", 20, 19, "RCB"));
		ipl_db.add(new Player(13, "Yash Dayal", 15, 16, "RCB"));
		ipl_db.add(new Player(5, "Suyash Sharma", 30, 12, "RCB"));
		
		ipl_db.add(new Player(77, "Shubman Gill", 690, 0, "GT"));
		ipl_db.add(new Player(27, "Sai Sudharsan", 620, 0, "GT"));
		ipl_db.add(new Player(3, "Jos Buttler", 510, 0, "GT"));
		ipl_db.add(new Player(8, "Sherfane Rutherford", 310, 0, "GT"));
		ipl_db.add(new Player(5, "Shahrukh Khan", 240, 0, "GT"));
		ipl_db.add(new Player(99, "Rahul Tewatia", 180, 8, "GT"));
		ipl_db.add(new Player(7, "Washington Sundar", 170, 11, "GT"));
		ipl_db.add(new Player(24, "Rashid Khan", 95, 18, "GT"));
		ipl_db.add(new Player(12, "Mohammed Siraj", 30, 20, "GT"));
		ipl_db.add(new Player(9, "Prasidh Krishna", 25, 17, "GT"));
		ipl_db.add(new Player(11, "Sai Kishore", 40, 14, "GT"));
		
		ipl_db.add(new Player(1, "Abhishek Sharma", 560, 2, "SRH"));
		ipl_db.add(new Player(23, "Travis Head", 610, 0, "SRH"));
		ipl_db.add(new Player(32, "Ishan Kishan", 420, 0, "SRH"));
		ipl_db.add(new Player(63, "Nitish Kumar Reddy", 390, 8, "SRH"));
		ipl_db.add(new Player(17, "Heinrich Klaasen", 470, 0, "SRH"));
		ipl_db.add(new Player(29, "Aniket Verma", 220, 0, "SRH"));
		ipl_db.add(new Player(10, "Pat Cummins", 95, 16, "SRH"));
		ipl_db.add(new Player(44, "Harshal Patel", 60, 19, "SRH"));
		ipl_db.add(new Player(21, "Mohammed Shami", 35, 17, "SRH"));
		ipl_db.add(new Player(14, "Rahul Chahar", 25, 12, "SRH"));
		ipl_db.add(new Player(7, "Jaydev Unadkat", 15, 11, "SRH"));
		
		ipl_db.add(new Player(64, "Yashasvi Jaiswal", 625, 0, "RR"));
		ipl_db.add(new Player(9, "Vaibhav Suryavanshi", 390, 0, "RR"));
		ipl_db.add(new Player(11, "Sanju Samson", 510, 0, "RR"));
		ipl_db.add(new Player(45, "Riyan Parag", 430, 6, "RR"));
		ipl_db.add(new Player(25, "Dhruv Jurel", 280, 0, "RR"));
		ipl_db.add(new Player(18, "Shimron Hetmyer", 250, 0, "RR"));
		ipl_db.add(new Player(99, "Wanindu Hasaranga", 160, 14, "RR"));
		ipl_db.add(new Player(22, "Jofra Archer", 50, 18, "RR"));
		ipl_db.add(new Player(30, "Maheesh Theekshana", 40, 15, "RR"));
		ipl_db.add(new Player(7, "Tushar Deshpande", 20, 13, "RR"));
		ipl_db.add(new Player(12, "Sandeep Sharma", 15, 14, "RR"));
		
		
		
		
		return ipl_db;
	}

}
