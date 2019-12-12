
public class Compte {
protected long numero;
protected double solde;
protected  Client client;

	public Compte(long numero, double solde) {
	this.numero = numero;
	this.solde = solde;
	}
	

	public Compte(long numero, Client client) {
		this.numero = numero;
		this.client = client;
	}


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

public void deposer(double mnt)
{
	this.solde+=mnt;
}
public void reterer(double mnt)
{
if(this.solde>mnt)
	{
		this.solde-=mnt;
	}
else
{
	System.out.println("impossible");
}
}
@Override
public String toString() {
	return "Compte [solde=" + solde + ", numero du compte=" + client.getCode() + "]";
}

public void verer_Vers(double mnt,Compte c)
{
	if(this.solde>mnt)
	{
		c.solde+=mnt;
		this.solde-=mnt;
	}
else
{
	System.out.println("impossible");
}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Client c1=new Client(1,"Gold");
	Client c2=new Client(2,"Sliver");
	Compte comp1=new Compte(1,5000);
	Compte comp2=new Compte(1,200);
	String compte1=comp1.toString() ;
	String compte2=comp2.toString() ;
	System.out.println(compte1);
	System.out.println(compte2);
	comp1.deposer(50);
	System.out.println(comp1.solde);
	comp2.deposer(100);
	System.out.println(comp2.solde);
	comp1.verer_Vers(50,comp2);
	System.out.println(comp1.solde);
	System.out.println(comp2.solde);
	
	}

}
