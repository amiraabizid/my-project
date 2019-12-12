package ex1;

public abstract class FormeGeometrique {
	public  double abs;
	public  double ord;
	public FormeGeometrique(double abs, double ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}
	final double pi=3.14;
	public double getAbs() {
		return abs;
	}
	
	public void setAbs(double abs) {
		this.abs = abs;
	}
	public double getOrd() {
		return ord;
	}
	public void setOrd(double ord) {
		this.ord = ord;
	}
	
	public abstract void identifier();
	public abstract void affiche();
	public abstract double surface();
}
