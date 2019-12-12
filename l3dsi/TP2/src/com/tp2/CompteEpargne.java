package com.tp2;

import javax.swing.DebugGraphics;

public class CompteEpargne extends Compte{
	
	private CompteCourant compteCr;
	private double montant;
	
	public CompteCourant getCompteCr() {
		return compteCr;
	}

	public void setCompteCr(CompteCourant compteCr) {
		this.compteCr = compteCr;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	
	public CompteEpargne(long numero, double solde, CompteCourant compteCr, double montant) {
		super(numero, solde);
		this.compteCr = compteCr;
		this.montant = montant;
	}
	public boolean transfert (double mnt)
	{
		boolean test=false;
		if (this.retirer(mnt))
		{
			compteCr.deposer(mnt);
			test=true;
		}
		return test;
	}
	@Override
	public String toString() {
		return "Compte epragne ["+super.toString()+"]";
	}

	
}
