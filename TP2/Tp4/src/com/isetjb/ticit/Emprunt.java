package com.isetjb.ticit;

public class Emprunt {
private Date dateEmprunt;
private Date dateRetour;
private Etudiant etudiant;
private Ouvrage ouvrage;



public Emprunt(Date dateEmprunt, Date dateRetour, Etudiant etudiant, Ouvrage ouvrage) {
	super();
	this.dateEmprunt = dateEmprunt;
	this.dateRetour = dateRetour;
	this.etudiant = etudiant;
	this.ouvrage = ouvrage;
}
public Etudiant getEtudiant() {
	return etudiant;
}
public void setEtudiant(Etudiant etudiant) {
	this.etudiant = etudiant;
}
public Ouvrage getOuvrage() {
	return ouvrage;
}
public void setOuvrage(Ouvrage ouvrage) {
	this.ouvrage = ouvrage;
}
public Date getDateEmprunt() {
	return dateEmprunt;
}
public void setDateEmprunt(Date dateEmprunt) {
	this.dateEmprunt = dateEmprunt;
}
public Date getDateRetour() {
	return dateRetour;
}
public void setDateRetour(Date dateRetour) {
	this.dateRetour = dateRetour;
}
@Override
public String toString() {
	return "Emprunt [dateEmprunt=" + dateEmprunt + ", dateRetour=" + dateRetour + "]";
}

public void info() {
	System.out.println("date Emprunt:"+this.dateEmprunt +"date retour:"+this.dateRetour);
}
public void Alert()
{
	
}
}
