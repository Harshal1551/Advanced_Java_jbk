package com.tka.entity;

public class Player {

	private int jn;
	private String pname;
	private int runs;
	private int wickets;
	private String tname;
	
	public Player () {
		
	}
	
	
	public Player(int jn, String pname, int runs, int wickets, String tname) {
		super();
		this.jn = jn;
		this.pname = pname;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}


	public int getJn() {
		return jn;
	}


	public void setJn(int jn) {
		this.jn = jn;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	@Override
	public String toString() {
		return "Player [jn=" + jn + ", pname=" + pname + "]";
	}
	
	
	
	
	
}
