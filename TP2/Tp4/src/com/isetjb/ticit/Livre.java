package com.isetjb.ticit;

public class Livre extends Ouvrage implements IDelai {
	private String Auteur;

	public Livre(String titre, String editeur, Date datedition, double prix, String aut) {
		super(titre, editeur, datedition, prix);
		this.Auteur=aut;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int nbreJours(Etudiant e) {
		int nbj=0;
		if(e.getNiveau().equals("l1"))
		{
			nbj=3;
		}
		else if(e.getNiveau().equals("l2"))
		{
			nbj=4;
		}
		else if (e.getNiveau().equals("l3"))
		{
			nbj=5;
		}
		return nbj;
	}
	

}
