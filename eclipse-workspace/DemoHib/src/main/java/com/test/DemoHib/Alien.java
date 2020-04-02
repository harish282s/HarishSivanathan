package com.test.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aid;
	//private String aname;
	private AlienName aname;
	private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

//	public String getAname() {
//		return aname;
//	}
//
//	public void setAname(String aname) {
//		this.aname = aname;
//	}
	
	

	public String getColor() {
		return color;
	}

	public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

}
