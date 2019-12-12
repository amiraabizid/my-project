package com.tp2;

import java.util.ArrayList;

public class BanqueApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Client> clientBanque=new ArrayList<Client>();
		Client2 c1=new Client2(1,"client1");
		Client2 c2=new Client2(2,"client2");
		Client2 c3=new Client2(3,"client3");
		Client2 c4=new Client2(4,"client4");
		
		clientBanque.add(c1);
		clientBanque.add(c2);
		clientBanque.add(c3);
		clientBanque.add(c4);
		
		System.out.println("Les clients de la banque:");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(clientBanque);
		for (int i=0;i<4;i++)
		{
			CompteCourant cc =new CompteCourant((c1.getCode()*1000)+1, 0);
			CompteEpargne ce= new CompteEpargne((c1.getCode()*1000)+2, 50, cc, 50);
		
			System.out.println("+++++Avant transfert+++++");
			System.out.println("solde compte epargne"+ce.getSolde());
			System.out.println("solde compte courant" +cc.getSolde());
		
			c1.addCompte(cc);
			c1.addCompte(ce);
			ce.transfert(50);
			System.out.println("+++++Apres transfert+++++");
			System.out.println("solde compte epargne"+ce.getSolde());
			System.out.println("solde compte courant" +cc.getSolde());
		
		}
		System.out.println("Les clients de la banque:");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(clientBanque);
		
	}

}
