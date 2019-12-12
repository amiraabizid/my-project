package ex1;

public class Rectangle  extends FormeGeometrique {
	private  double largeur;
	private double langueur;
	
	public Rectangle(double abs, double ord,double larg,double longu) {
		super(abs, ord);
		// TODO Auto-generated constructor stub
		this.langueur=longu;
		this.largeur=larg;
	}


	@Override
	public void identifier() {
		// TODO Auto-generated method stub
		System.out.println("c'est un rectangle");
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
		double s=largeur*langueur;
		return s;
	}

}
