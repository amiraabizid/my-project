package net.isetjb.hibernatetutorial;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Application {
	/**
	 * Attribute declaration for factory to share between methods.
	 */
	private static SessionFactory factory;

	public static  List<Object[]> affiche()
	{
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String  req="select * from product ";
		List<Object[]> l =	(List<Object[]>) session.createNativeQuery(req).getResultList();

		transaction.commit();
		session.close();

		return l;
	}
	public static void Update(int id,String name,int price)
	{
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String req="UPDATE product set name='"+name+"'  where id="+id;
		int result = (int) session.createNativeQuery(req).executeUpdate();
		System.out.println("Result ==> " + result);
		transaction.commit();

		session.close();
	}
	public static void  delete (int id )
	{
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String req="delete from product  where id="+id;
		int result = (int) session.createNativeQuery(req).executeUpdate();
		System.out.println("Result ==> " + result);
		transaction.commit();

		session.close();
	}


	public static void insert()
	{
		// Open connection pool
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// Insert record :
		int randomNumber = new Random().nextInt(100);
		String sql3 = "INSERT INTO product VALUES(null, 'Name_" +
				randomNumber + "' , " + randomNumber + ")";
		int result3 = (int) session.createNativeQuery(sql3).executeUpdate();
		System.out.println("Result3 ==> " + result3);
		transaction.commit();
		session.close();
		// Cleaning up connection pool
		factory.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open connection pool

		// Cleaning up connection pool

		List<Object[]> l=affiche();
			 for (int i=0;i<l.size();i++)
			 {
				 System.out.println("id: "+ l.get(i)[0]+" name : "+ l.get(i)[1]+" price :"+l.get(i)[2]);
			 }

		//Update(3,"amira",5);
		//delete(2);
		//insert();
	}
}
