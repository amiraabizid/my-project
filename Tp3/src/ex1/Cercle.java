package ex1;

public class Cercle extends FormeGeometrique {

	private double rayon;
	public Cercle(double abs, double ord ,double r) {
		super(abs, ord);
		// TODO Auto-generated constructor stub
		this.rayon=r;
	}

	

	@Override
	public void identifier() {
		// TODO Auto-generated method stub
		System.out.println("c'est une cercle");
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		
		double s=surface();
		System.out.println("l'abscisse de centre:"+abs+"l'ordonne de centre:"+ord+"la surface:"+s);
	}

	@Override
	public double  surface() {
		// TODO Auto-generated method stub
		double s=pi*rayon*rayon;
		return s;
	}

}
