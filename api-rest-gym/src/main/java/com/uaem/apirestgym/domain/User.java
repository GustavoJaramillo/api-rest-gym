package com.uaem.apirestgym.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String name;
	private String lastName;
	private String socialSegurityNumber;
	private int month;
	private int idMembership;
	private int idAdministrator;
	
	
	public User() {
		
	}
	
	public User(int idUser) {
		
		this.idUser = idUser;
		
	}
	
	public User(String name, String lastName, String socialSegurityNumber, int month, int idMembership, int idAdministrator) {
		
		this.name = name;
		this.lastName = lastName;
		this.socialSegurityNumber = socialSegurityNumber;
		this.month = month;
		this.idMembership = idMembership;
		this.idAdministrator = idAdministrator;

	}
	
	public User(int idUser, String name, String lastName, String socialSegurityNumber, int month, int idMembership, int idAdministrator) {
		
		this.idUser = idUser;
		this.name = name;
		this.lastName = lastName;
		this.socialSegurityNumber = socialSegurityNumber;
		this.month = month;
		this.idMembership = idMembership;
		this.idAdministrator = idAdministrator;

	}
	
	public int getIdUser() {
		return this.idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSocialSegurityNumber() {
		return this.socialSegurityNumber;
	}
	
	public void setSocialSegurityNumber(String socialSegurityNumber) {
		this.socialSegurityNumber = socialSegurityNumber;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getIdMembership() {
		return this.idMembership;
	}
	
	public void setIdMembership(int idMembership) {
		this.idMembership = idMembership;
	}
	
	public int getIdAdministrator() {
		return this.idAdministrator;
	}
	
	public void setIdAdministrator(int idAdministrator) {
		this.idAdministrator = idAdministrator;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", lastName=" + lastName + ", socialSegurityNumber="
				+ socialSegurityNumber + ", month=" + month + ", idMembership=" + idMembership + ", idAdministrator="
				+ idAdministrator + "]";
	}
	
	
	
	
	
	
	
	
}
