package com.isetjb.ticit;

public class Livre extends Ouvrage {

	private String auteur;

	public Livre(String titre, String editeur, Date dateEdition, double prix,String auteur) {
		super(titre, editeur, dateEdition, prix);
		// TODO Auto-generated constructor stub
		this.auteur=auteur;
	}

	@Override
	public int nbreJours(Etudiant e) {
		// TODO Auto-generated method stub
		int nb=0;
		if(e.getNiveau().equals("niveau1"))
			nb=3;
		else if(e.getNiveau().equals("niveau2"))
			nb=4;
		else if(e.getNiveau().equals("niveau3"))	
			nb=5;
		return nb;
	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", titre=" + titre + ", editeur=" + editeur + ", dateEdition=" + dateEdition
				+ ", prix=" + prix + "]";
	}
	

}
