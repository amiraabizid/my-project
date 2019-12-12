
public class CompteEpargne extends Compte {
	
	 public CompteCourant compteTransfert;
	 public double montantTransfert;
	
	 public CompteEpargne(long num�ro,CompteCourant compteTransfert, double montantTransfert,double solde){
	 super(num�ro,solde);
	 	this.compteTransfert = compteTransfert;
	 	this.montantTransfert = montantTransfert;
	 }
	 
	 public void transfert(double mnt){
	 reterer(mnt);
	 compteTransfert.deposer(mnt);
	
	 }
	 public String toString(){
	 return "Compte �pargne num�ro " + getNumero() + " solde " + getSolde();
	 }


}
