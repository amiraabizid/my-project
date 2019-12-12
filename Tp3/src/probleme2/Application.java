package probleme2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fichier fichier1=new fichier("examen", ".doc", "C:\\word", 2);
		fichier fichier2=new fichier("bulletin", ".xls", " C:\\excel", 2);
		fichier fichier3=new fichier("nature", ".gif", "C:", 2);
		disqueDur disque=new disqueDur(" C : ", 0,9375, 520,  1024);
		
		disque.ajouterFichier(fichier1);
		disque.ajouterFichier(fichier2);
		disque.ajouterFichier(fichier3);
		
		
		disque.affiche();
		
		System.out.println("les fichiers du disque ayant l'extension .doc");
		ArrayList fichiers=disque.explorerExtension(".doc");
		System.out.println(fichiers);
	}

}
