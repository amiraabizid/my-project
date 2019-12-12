package com.tp2;

public class Compte {
	private long numero;
	private double solde;
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Compte(long numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	public void deposer(double mnt)
	{
		solde+=mnt;
	}
	
	public boolean verif(double mnt)
	{
		boolean test=false;
		if(solde-mnt>=0)
			test=true;
		return test;
	}
	public boolean retirer(double mnt)
	{
		boolean test=false;
		if(verif(mnt))
		{
			solde-=mnt;
			test=true;
		}
		return test;
	}
	public boolean virerVers (double mnt,Compte c)
	{
		boolean test=false;
		if(retirer(mnt))
		{
			c.solde+=mnt;
			test=true;
		}
		return test;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
	
}
