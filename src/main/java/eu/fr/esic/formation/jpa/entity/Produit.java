package eu.fr.esic.formation.jpa.entity;

import java.io.Serializable;


/**
 * The persistent class for the PRODUIT database table.
 * 
 */
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idProduit;

	private String gamme;

	private String libelle;

	private String marque;

	private Double prixUnitaire;

	private String refProduit;

	private Commande commande;

	public Produit() {
	}
	
	public Produit(String gamme,String marque,String lib,Double prixU,String refP) {
		this.gamme = gamme;
		this.marque = marque;
		this.libelle = lib;
		this.prixUnitaire = prixU;
		this.refProduit = refP;
	}

	public Integer getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getGamme() {
		return this.gamme;
	}

	public void setGamme(String gamme) {
		this.gamme = gamme;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Double getPrixUnitaire() {
		return this.prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public String getRefProduit() {
		return this.refProduit;
	}

	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	public String toString(){
		return "Produit [REF_PRODUIT : "+this.refProduit+"]" + " a pour Libelle :"+this.libelle;
	}

}