package com.isetjb.ticit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Bibliotheque {
	
	private static String Etablissement;
	private static ArrayList<Emprunt> TEmprunts;

	
	public String getEtablissement() {
		return Etablissement;
	}


	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}


	public ArrayList<Emprunt> getTEmprunts() {
		return TEmprunts;
	}


	public void setTEmprunts(ArrayList<Emprunt> tEmprunts) {
		TEmprunts = tEmprunts;
	}
	public static boolean test(Emprunt e)
	{
		boolean test=false;
		e.getOuvrage().getClass().getName();
		if(e.getDateEmprunt().periode(e.getDateEmprunt(),e.getDateRetour())>e.getOuvrage().nbreJours(e.getEtudiant()))
			test=true;
		return test;
	}
	public static void info() {
		System.out.println("--------bibliothèque "+Etablissement+"----------");
		for (int i=0;i<TEmprunts.size();i++)
		{
			System.out.println(TEmprunts.get(i).toString());
			if(test(TEmprunts.get(i))) 
				System.out.println("Depassement des dates");
		}
	}
	public Bibliotheque(String etablissement) {
		super();
		Etablissement = etablissement;
		TEmprunts = new ArrayList<Emprunt>();
	}


	@Override
	public String toString() {
		return "Bibliotheque [Etablissement"+Etablissement+"]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant e1=new Etudiant(1, "Ben salah", "salah", "niveau1","TI14");
		Etudiant e2=new Etudiant(2, "Ben Mansour","Mansour","niveau2","L2-MDW");
		
		Date d1=new Date(20,04,2003);
		Date d2=new Date(01,03,2019);
		
		Livre l=new Livre("Base de données","Eyrolles",d1,80,"Georges Gardarin");
		Revue r=new Revue("Science et Vie","EdiGroup", d2, 8, 1215, "Mensuel");
		Emprunt em1=new Emprunt(new Date(1,5,2019), new Date(2,5,2019), e1, l);
		Emprunt em2=new Emprunt(new Date(1,5,2019), new Date(8,5,2019), e2, r);
		Bibliotheque b=new Bibliotheque("ISET");
		System.out.println(b.toString());
		TEmprunts.add(em1);TEmprunts.add(em2);
		info();
	}

}
