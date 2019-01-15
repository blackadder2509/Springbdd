package com.wildcodeschool.springBoot.springBootdemo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wilder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String langage;
	
	
	public Wilder() {
		
	}


	public Wilder(String firstName, String lastName, String langage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.langage = langage;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName+" "+langage;
	}


	public Long getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getLangage() {
		return langage;
	}


	public void setLangage(String langage) {
		this.langage = langage;
	}
	
}
