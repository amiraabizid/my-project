
public class CompteCourant extends Compte {

	public CompteCourant(long numero,double solde) {
		super(numero,solde);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return"Compte courant numéro " + getNumero() + " solde " + getSolde();
	}

}
