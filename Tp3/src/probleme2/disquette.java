package probleme2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class disquette extends Support {

	
	public disquette(String nomLogique, double taille, int nbrSecteur, int nbrPiste) {
		super(nomLogique, taille, nbrSecteur, nbrPiste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEspaceDisque() {
		double espace= nbrPiste*nbrSecteur*taille;
		return espace;
	}
	@Override
	public double getEspaceLibre() {
		
		double espaceDisq=getEspaceDisque();
		double espaceOccup=0;
		double espaceLibre=0;
		for(int i=0;i<fichiers.size();i++)
		{
			espaceOccup+=fichiers.get(i).getTaille();
		}
		
		 espaceLibre+=espaceDisq-espaceOccup;
		return  espaceLibre;
	}
	@Override
	public void ajouterFichier( fichier f) {
		// TODO Auto-generated method stub
		if(getEspaceLibre()-f.getTaille()>=0)
		{
			fichiers.add(f);
			detailFichier.put(f.getNom(), f.getEmplacement());
		}
		else
		{
			System.out.println("Pas d'espace libre");
		}
	}
	@Override
	public ArrayList explorerExtension( String extension) {
		// TODO Auto-generated method stub
		ArrayList<fichier> listFichiers=new ArrayList<fichier>();
		for(int i=0;i<fichiers.size();i++)
		{
			if(fichiers.get(i).getExtension().equals(extension))
				listFichiers.add(fichiers.get(i));
		}
		return listFichiers;
	}
	
}

