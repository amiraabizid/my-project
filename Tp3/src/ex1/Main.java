package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ord=3;
		double abs=4;
        FormeGeometrique c=new Carre(abs,ord,4);
        c.affiche();
        c.identifier();
        double s=c.surface();
        System.out.println("surface carre: "+s);
        FormeGeometrique r=new Rectangle(abs,ord,4,6);
        r.affiche();
        r.identifier();
        double surfrec=r.surface();
        System.out.println("surface rectangle: "+surfrec);
        
        FormeGeometrique cercle=new Cercle(abs,ord,4);
        cercle.affiche();
        cercle.identifier();
        double surfcercle=cercle.surface();
        System.out.println("surface cercle: "+surfcercle);
        
	}

}
