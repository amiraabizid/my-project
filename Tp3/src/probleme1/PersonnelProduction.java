package probleme1;

public abstract class PersonnelProduction {
	public String nom;
	public String prenom;
	public double salaire;
	public int age;
	
	public PersonnelProduction(String nom, String prenom, double salaire, int age) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void affiche();

	public abstract String toString();

}
