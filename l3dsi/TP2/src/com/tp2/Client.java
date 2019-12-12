package com.tp2;

public class Client {

	private long code;
	private String nom;
	private Compte compte;
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Client(long code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Client [code=" + code + ", nom=" + nom + "]";
	}
	
	
	
}
