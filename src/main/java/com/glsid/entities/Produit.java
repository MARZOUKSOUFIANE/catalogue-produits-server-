package com.glsid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;
	private String designation;
	private double price;
	private int quantite;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String designation, double price, int quantite) {
		super();
		this.designation = designation;
		this.price = price;
		this.quantite = quantite;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
