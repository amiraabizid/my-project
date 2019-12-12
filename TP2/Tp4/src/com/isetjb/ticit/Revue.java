package com.isetjb.ticit;

public class Revue extends Ouvrage implements IDelai {
    private int numero;
    private String periodicite;
	public Revue(String titre, String editeur, Date datedition, double prix,int num,String perio) {
		super(titre, editeur, datedition, prix);
		this.numero=num;
		this.periodicite=perio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int nbreJours(Etudiant e) {
		// TODO Auto-generated method stub
		int nbj;
		if(e.getNiveau().equals("l1"))
		{
			nbj=1;
		}
		else if(e.getNiveau().equals("l2"))
		{
			nbj=2;
		}
		else {
			nbj=3;
		}
		return nbj;
	}

}
