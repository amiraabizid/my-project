package com.tp2;

import java.util.ArrayList;

public class Client2 extends Client{

	private ArrayList<Compte> listCompte=new ArrayList<Compte>();
	
	@Override
	public String toString() {
		return super.toString()+"Client2[ listCompte=" + listCompte + "]";
	}

	public ArrayList<Compte> getListCompte() {
		return listCompte;
	}

	public void setListCompte(ArrayList<Compte> listCompte) {
		this.listCompte = listCompte;
	}

	public Client2(long code, String nom) {
		super(code, nom);
	}
	public void addCompte (Compte c)
	{
		listCompte.add(c);
	}
	

}
