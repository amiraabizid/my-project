package com.isetjb.ticit;

import java.util.ArrayList;

public class Bibliotheque {
	private static  String Etablissement;
	private static  ArrayList<Emprunt> TEmprunts;
  
	public  String getEtablissement() {
		return Etablissement;
	}

	public  void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}

	public  ArrayList<Emprunt> getTEmprunts() {
		return TEmprunts;
	}

	public  void setTEmprunts(ArrayList<Emprunt> tEmprunts) {
		TEmprunts = tEmprunts;
	}

	public Bibliotheque(String etablissement, ArrayList<Emprunt> tEmprunts) {
		super();
		Etablissement = etablissement;
		TEmprunts = tEmprunts;
	}
	public static boolean test(Emprunt e)
	{
		boolean test=false;
		
		return test;
	}
	public static void info() {
		System.out.println("bibliothèque "+Etablissement+"----------");
		for (int i=0;i<TEmprunts.size();i++)
		{
			System.out.println(TEmprunts.get(i).toString());
			if(test(TEmprunts.get(i))) 
				System.out.println("Depassement des dates");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
