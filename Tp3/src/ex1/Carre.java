package ex1;

public class Carre extends FormeGeometrique {
	
	private double largeur;
    public Carre(double abs, double ord,double larg) {
		super(abs, ord);
		// TODO Auto-generated constructor stub
		this.largeur=larg;
	}

	
	@Override
	public void identifier() {
		// TODO Auto-generated method stub
		System.out.println("c'est un carre");
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		double s=surface();
		System.out.println("l'abscisse de centre:"+abs+"l'ordonne de centre:"+ord+"la surface:"+s);
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		double s=largeur*largeur;
		return s;
	}

}
