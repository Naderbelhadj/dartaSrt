package com.fst.srt.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@OneToMany
	List<Produit>produits;
	
	public Category() {
		super();
	}
	public Category(List<Produit> produits, long id, String nom) {
		super();
		this.produits = produits;
		this.id = id;
		this.nom = nom;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Id
	private long id;

	private String nom;
	

}
