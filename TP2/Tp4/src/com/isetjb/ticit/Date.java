package com.isetjb.ticit;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	
	public int getJour() {
		return jour;
	}
	
	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public void setMois(int mois) {
		this.mois = mois;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public Date(int jour, int mois, int annee) {
		
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	@Override
	public String toString() {
		
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
		
	}
	
	
	public int  convertirJours(Date date)
		{
		int nbj=0;;
		if((date.mois==1)||(date.mois==3)||(date.mois==5)||(date.mois==7)||(date.mois==8)||(date.mois==10)||(date.mois==12))
			{
			 nbj+=date.jour+(date.mois*31)+(date.annee*365);
			}
		else if((date.mois==4)||(date.mois==6)||(date.mois==9)||(date.mois==11))
		{
		nbj=+date.jour+(date.mois*30)+(date.annee*365);
		}
		else 
		{
			if((date.annee % 100 != 0) && (date.annee% 4 == 0)) {
				 nbj=+date.jour+(date.mois*28)+(date.annee*365);
			}
			else
			{
				 nbj=+date.jour+(date.mois*29)+(date.annee*365);
			}
		}
		
			return nbj;
		}
	
	public static  int Periode(Date date1,Date date2)
	{
		int periode;
		int nb= date1.convertirJours(date1);
		int nb2= date2.convertirJours(date2);
		
			periode=nb2-nb;
		
	
		return periode;
	}
	
}
	


