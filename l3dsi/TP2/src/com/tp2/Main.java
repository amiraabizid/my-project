package com.tp2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//partie1
//		Client c1=new Client(1, "Gold");
//		Client c2=new Client(2, "Silver");
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		
//		//partie2
//		Client c1=new Client(1, "Gold");
//		Client c2=new Client(2, "Silver");
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
//		Compte cp1=new Compte(1, 0);
//		Compte cp2=new Compte(2, 0);
//		c1.setCompte(cp1);
//		c2.setCompte(cp2);
//		cp1.deposer(50);
//		cp2.deposer(100);
//		if(!cp1.virerVers(50, cp2))
//			System.out.println("virement imposssible");
//		System.out.println(cp1.toString());
//		System.out.println(cp2.toString());
		
		
//		//partie3
		Client2 c1=new Client2(1, "Gold");
		Compte cp1=new Compte(1, 0);
  		Compte cp2=new Compte(2, 0);
  		Compte cp3=new Compte(3, 0);
  		
  		cp1.deposer(50);
  		cp2.deposer(100);
  		cp3.deposer(150);
  		
  		c1.addCompte(cp1);
  		c1.addCompte(cp2);
  		c1.addCompte(cp3);
  		System.out.println(c1.toString());
	}

}
