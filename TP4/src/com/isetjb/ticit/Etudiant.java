package com.isetjb.ticit;

public class Etudiant {
	private int nce ;
	private String nom;
	private String prenom;
	private String niveau;
	private String classe;
	public int getNce() {
		return nce;
	}
	public void setNce(int nce) {
		this.nce = nce;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Etudiant(int nce, String nom, String prenom, String niveau, String classe) {
		super();
		this.nce = nce;
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
		this.classe = classe;
	}
	@Override
	public String toString() {
		return "Etudiant [nce=" + nce + ", nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + ", classe="
				+ classe + "]";
	}
	
	
}
