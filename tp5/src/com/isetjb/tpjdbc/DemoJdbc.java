package com.isetjb.tpjdbc;


import java.sql.*;
public class DemoJdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inserePersonne("P1","Ben Salah","Salah");
		UpdatePersonne("p1","ben abizid","amira");
		//insereVille(1,"Djerba");
		//UpdateVille(1,"mednine");
		deleteVille(1);
	}

	//insertion personne
	public static void inserePersonne(String code, String nom, String prenom) {
		String url = "jdbc:mysql://localhost/jdbcDB";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			// Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// R�cup�ration de la connexion
			cn=DriverManager.getConnection(url,login, passwd);
			// Cr�ation d�un statement
			st=cn.createStatement();
			// Ex�cution des requ�tes : Insertion de donn�es
			st.executeUpdate("insert into `Personne` values ('"+code+
					"','"+nom+ "','"+prenom+"')");
			// R�cup�ration et affichage de donn�es
			rs=st.executeQuery("select * from Personne");
			while(rs.next()) {
				System.out.print(rs.getString("code"));
				// Passer comme param�tre le nom ou le num�ro de colonne
				System.out.print(" "+rs.getString(2));
				System.out.println(" "+rs.getString(3));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				// Lib�rer les ressources de la m�moire
				cn.close();
				st.close();
				rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//update personne
	public static void UpdatePersonne(String code, String nom, String prenom) {
		String url = "jdbc:mysql://localhost/jdbcDB";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			// Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// R�cup�ration de la connexion
			cn=DriverManager.getConnection(url,login, passwd);
			// Cr�ation d�un statement
			st=cn.createStatement();
			// Ex�cution des requ�tes : Insertion de donn�es
			st.executeUpdate("UPDATE `personne` SET `nom`='"+nom+"',`prenom`='"+prenom+"' WHERE  code='"+code+"'");
			// R�cup�ration et affichage de donn�es
			rs=st.executeQuery("select * from Personne");
			while(rs.next()) {
				System.out.print(rs.getString("code"));
				// Passer comme param�tre le nom ou le num�ro de colonne
				System.out.print(" "+rs.getString(2));
				System.out.println(" "+rs.getString(3));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				// Lib�rer les ressources de la m�moire
				cn.close();
				st.close();
				rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//insertion ville

	public static void insereVille(int identifiant, String nomVille) {
		String url = "jdbc:mysql://localhost/jdbcDB";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			// Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// R�cup�ration de la connexion
			cn=DriverManager.getConnection(url,login, passwd);
			// Cr�ation d�un statement
			st=cn.createStatement();
			// Ex�cution des requ�tes : Insertion de donn�es
			st.executeUpdate("insert into `Ville` values ("+identifiant+
					",'"+nomVille+ "')");
			// R�cup�ration et affichage de donn�es
			rs=st.executeQuery("select * from Ville");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				// Passer comme param�tre le nom ou le num�ro de colonne
				System.out.print(" "+rs.getString(2));

			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				// Lib�rer les ressources de la m�moire
				cn.close();
				st.close();
				rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}


	//update ville
	public static void UpdateVille(int id, String nom) {
		String url = "jdbc:mysql://localhost/jdbcDB";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			//R�cup�ration de la connexion
			cn=DriverManager.getConnection(url,login, passwd);
			//Cr�ation d�un statement
			st=cn.createStatement();
			//Ex�cution des requ�tes : Insertion de donn�es
			st.executeUpdate("UPDATE `Ville` SET `nomVille`='"+nom+"' WHERE  identifiant="+id);
			//R�cup�ration et affichage de donn�es
			rs=st.executeQuery("select * from Ville");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				// Passer comme param�tre le nom ou le num�ro de colonne
				System.out.print(" "+rs.getString(2));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				//Lib�rer les ressources de la m�moire
				cn.close();
				st.close();
				rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//delete ville
		public static void deleteVille(int id) {
			String url = "jdbc:mysql://localhost/jdbcDB";
			String login="root";
			String passwd="";
			Connection cn=null;
			Statement st=null;
			ResultSet rs=null;
			try {
				//Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				//R�cup�ration de la connexion
				cn=DriverManager.getConnection(url,login, passwd);
				//Cr�ation d�un statement
				st=cn.createStatement();
				//Ex�cution des requ�tes : Insertion de donn�es
				st.executeUpdate("DELETE FROM `ville` WHERE  identifiant="+id);
				//R�cup�ration et affichage de donn�es
				rs=st.executeQuery("select * from Ville");
				while(rs.next()) {
					System.out.print(rs.getInt(1));
					// Passer comme param�tre le nom ou le num�ro de colonne
					System.out.print(" "+rs.getString(2));
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally{
				try {
					//Lib�rer les ressources de la m�moire
					cn.close();
					st.close();
					rs.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
}