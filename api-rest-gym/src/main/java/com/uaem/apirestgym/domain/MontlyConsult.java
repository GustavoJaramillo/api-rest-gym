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
@Table(name="monthly_consult")
public class MontlyConsult implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsult;
	private int monthlyAmount;
	private int monthNum;
	private int idAdministrator;
	
	public MontlyConsult(int idConsult) {
		this.idConsult = idConsult;
	}
	
	public MontlyConsult(int idConsult, int monthlyAmount, int monthNum, int idAdministrator) {
		this.idConsult = idConsult;
		this.monthlyAmount = monthlyAmount;
		this.monthNum = monthNum;
		this.idAdministrator = idAdministrator;
	}
	
	public int getIdConsult() {
		return this.idConsult;
	}
	
	public void setIdConsult(int idConsult) {
		this.idConsult = idConsult;
	}
	
	public int getMonthlyAmount() {
		return this.monthlyAmount;
	}
	
	public void setMonthlyAmount(int monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	public int getMonthNum() {
		return this.monthNum;
	}
	
	public void setMonthNum(int monthNum) {
		this.monthNum = monthNum;
	}
	
	public int getIdAdministrator() {
		return this.idAdministrator;
	}
	
	public void setIdAdministrator(int idAdministrator) {
		this.idAdministrator = idAdministrator;
	}

	@Override
	public String toString() {
		return "MontlyConsult [idConsult=" + idConsult + ", monthlyAmount=" + monthlyAmount + ", monthNum=" + monthNum
				+ ", idAdministrator=" + idAdministrator + "]";
	}
	
	
	
}
