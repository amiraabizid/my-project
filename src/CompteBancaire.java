import java.util.ArrayList;

public class CompteBancaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<Client2> listClient=new ArrayList<Client2>();
	 ArrayList<Compte> listComptes=new ArrayList<Compte>();
	 Client2 client1=new Client2(1,"client1");
		Client2 client2=new Client2(2,"client2");
		Client2 client3=new Client2(3,"client3");
		Client2 client4=new Client2(4,"client4");
		
		listClient.add(client1);
		listClient.add(client2);
		listClient.add(client3);
		listClient.add(client4);
	
	 for (int i=0;i<=4;i++)
	 {
		CompteCourant  c=new CompteCourant (client3.getCode()*1000+1,50);
		CompteEpargne cep=new CompteEpargne(client3.getCode()*1000+2,c,50,100);
		System.out.println("Avant transfert");
		System.out.println(cep.getSolde());
		System.out.println(c.getSolde());
		client3.addCompte(c);
		client3.addCompte(cep);
		cep.transfert(50);
		System.out.println(" transfert");
		System.out.println("solde compte courant" +c.getSolde());
		System.out.println("solde compte epargne"+cep.getSolde());
		
	}

	 System.out.println("Les clients de la banque:");
	
		System.out.println(listClient);
	
	
	
	}
	

}
