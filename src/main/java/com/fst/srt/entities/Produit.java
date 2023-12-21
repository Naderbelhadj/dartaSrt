package com.fst.srt.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="t_produit")
public class Produit {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)

private long id;
private String nom;
private String description;
@Override
public String toString() {
	return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + "]";
}
double prix;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Produit() {
	super();
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Produit(String nom, String description, double prix) {
	super();
	this.nom = nom;
	this.description = description;
	this.prix = prix;
}

}
