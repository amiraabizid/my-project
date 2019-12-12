
public class Client {
	protected long code;
	protected String nom;

	public Client(long code, String nom) {
		this.code = code;
		this.nom = nom;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}  
	

	@Override
	public String toString() {
		return "Client [code=" + code + ", nom=" + nom + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1=new Client(1,"Gold");
		Client c2=new Client(2,"Sliver");
		String client1=c1.toString();
		String client2=c2.toString();
		System.out.println(client1);
		System.out.println(client2);

	}



}
