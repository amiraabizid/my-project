package com.isetjb.ticit;

public class Revue extends Ouvrage {

	private int numero;
	private String periodicite;

	public Revue(String titre, String editeur, Date dateEdition, double prix,int numero,String periodicite) {
		super(titre, editeur, dateEdition, prix);
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.periodicite=periodicite;
	}

	@Override
	public int nbreJours(Etudiant e) {
		// TODO Auto-generated method stub
		int nb=0;
		if(e.getNiveau().equals("niveau1"))
			nb=1;
		else if(e.getNiveau().equals("niveau2"))
			nb=2;
		else if(e.getNiveau().equals("niveau3"))	
			nb=3;
		return nb;
	}

	@Override
	public String toString() {
		return "Revue [numero=" + numero + ", periodicite=" + periodicite + ", titre=" + titre + ", editeur=" + editeur
				+ ", dateEdition=" + dateEdition + ", prix=" + prix + "]";
	}
	
	
	
}

