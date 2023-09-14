package com.pre.check.java;

import java.util.ArrayList;
import java.util.List;

public class Participant {
	
	String name;
	String surname;
	int age;
	String sportType;
	List<String> awards;
	
	public Participant (String name, String surname, int age, String sportType) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sportType = sportType;
		this.awards = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSportType() {
		return sportType;
	}
	
	public List<String> getAwards(){
		return awards;
	}
	
	public void addAwards(String award) {
		awards.add(award);
	}
	

}
