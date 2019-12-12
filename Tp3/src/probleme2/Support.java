package probleme2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class Support {
	protected  String nomLogique;
	protected  double taille;
	protected  int nbrSecteur;
	protected  int nbrPiste;
	protected LinkedList<fichier> fichiers=new LinkedList<fichier>();
	protected HashMap<String, String> detailFichier=new HashMap<String, String>(); 
	
	public LinkedList<fichier> getFichiers() {
		return fichiers;
	}
	public void setFichiers(LinkedList<fichier> fichiers) {
		this.fichiers = fichiers;
	}
	public HashMap<String, String> getDetailFichier() {
		return detailFichier;
	}
	public void setDetailFichier(HashMap<String, String> detailFichier) {
		this.detailFichier = detailFichier;
	}
	public Support(String nomLogique, double taille, int nbrSecteur, int nbrPiste) {
		this.nomLogique = nomLogique;
		this.taille = taille;
		this.nbrSecteur = nbrSecteur;
		this.nbrPiste = nbrPiste;
	}
	public String getNomLogique() {
		return nomLogique;
	}
	public void setNomLogique(String nomLogique) {
		this.nomLogique = nomLogique;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public int getNbrSecteur() {
		return nbrSecteur;
	}
	public void setNbrSecteur(int nbrSecteur) {
		this.nbrSecteur = nbrSecteur;
	}
	public int getNbrPiste() {
		return nbrPiste;
	}
	public void setNbrPiste(int nbrPiste) {
		this.nbrPiste = nbrPiste;
	}
	
	public abstract double  getEspaceDisque() ;
	
	public abstract double  getEspaceLibre() ;
	
	 public abstract void ajouterFichier(fichier f) ;
	 
	 public abstract ArrayList explorerExtension( String extension);
	 public void affiche()
		{
			for(int i=0;i<fichiers.size();i++)
				System.out.println(fichiers.get(i).toString());
		}
	 
}
