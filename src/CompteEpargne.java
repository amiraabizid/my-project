
public class CompteEpargne extends Compte {
	
	 public CompteCourant compteTransfert;
	 public double montantTransfert;
	
	 public CompteEpargne(long numéro,CompteCourant compteTransfert, double montantTransfert,double solde){
	 super(numéro,solde);
	 	this.compteTransfert = compteTransfert;
	 	this.montantTransfert = montantTransfert;
	 }
	 
	 public void transfert(double mnt){
	 reterer(mnt);
	 compteTransfert.deposer(mnt);
	
	 }
	 public String toString(){
	 return "Compte épargne numéro " + getNumero() + " solde " + getSolde();
	 }


}
