package probleme1;

public class Ouvrier extends PersonnelProduction implements Ioperation {
	private  double  prixHeure;
	private int nbrheure;

	public Ouvrier(String nom, String prenom, double salaire, int age,double prix,int nbh) {
		super(nom, prenom, salaire, age);
		// TODO Auto-generated constructor stub
		this.nbrheure=nbh;
		this.prixHeure=prix;
	}

	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		salaire=nbrheure*prixHeure+PRIME_RIS;
		if(nbrheure>45)
		{
		 salaire=salaire+PRIME_REND;
		}
		else
		{
			salaire=nbrheure*prixHeure+PRIME_RIS;
		}
		
		System.out.println("le salaire d'ouvrier:"+salaire);
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		String info=toString();
		System.out.println(info);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "le nom:"+nom+"prenom:"+prenom+"salaire:"+salaire+"age:"+age+"nobre d'heure:"+nbrheure;
	}

}
