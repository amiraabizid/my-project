package com.isetjb.ticit;

public abstract class Ouvrage {
	protected String titre;
	protected String editeur;
	protected Date datedition;
	protected double prix;
	
	public Ouvrage(String titre, String editeur, Date datedition, double prix) {
		
		this.titre = titre;
		this.editeur = editeur;
		this.datedition = datedition;
		this.prix = prix;
	}

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

	public Date getDatedition() {
		return datedition;
	}

	public void setDatedition(Date datedition) {
		this.datedition = datedition;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", editeur=" + editeur + ", datedition=" + datedition + ", prix=" + prix
				+ "]";
	}

}
