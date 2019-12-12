package probleme2;

public class fichier {
	private String nom;
	private String extension;
	private String emplacement;
	private double taille;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public fichier(String nom, String extension, String emplacement, double taille) {
		
		this.nom = nom;
		this.extension = extension;
		this.emplacement = emplacement;
		this.taille = taille;
	}
	

}
