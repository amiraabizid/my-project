package com.isetjb.ticit;

public abstract class Ouvrage implements IDelai{

	protected String titre;
	protected String editeur;
	protected Date dateEdition;
	protected double prix;
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Ouvrage(String titre, String editeur, Date dateEdition, double prix) {
		super();
		this.titre = titre;
		this.editeur = editeur;
		this.dateEdition = dateEdition;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", editeur=" + editeur + ", dateEdition=" + dateEdition + ", prix=" + prix
				+ "]";
	}
	
	
	
	
}
