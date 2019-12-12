package probleme1;

public class Technicien extends PersonnelProduction implements Ioperation {
	private double salaireMensuel;

	public Technicien(String nom, String prenom, double salaire, int age,double sal) {
		super(nom, prenom, salaire, age);
		// TODO Auto-generated constructor stub
		this.salaireMensuel=sal;
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
		return "le nom:"+nom+"prenom:"+prenom+"salaire:"+salaire+"age:"+age+"sal:"+salaireMensuel;
	}

	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		salaire=salaireMensuel+PRIME_REND;

		System.out.println("le salaire de technicien:"+salaire);
	}

}
