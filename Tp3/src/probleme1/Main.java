package probleme1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Technicien tech=new Technicien("ben khalifa","khalifa",0,25,800);
		Ouvrier ouvrier=new Ouvrier("ben salah","salah",0,42,10,45);
		System.out.println("technicien");
		tech.affiche();
		tech.calculSalaire();
		System.out.println("ouvrier");
		ouvrier.affiche();
		ouvrier.calculSalaire();
	}

}
