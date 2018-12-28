package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee e1 = new Employee(111, "abc", "abc@gmail.com", 1000);
		Employee e2 = new Employee(112, "def", "def@gmail.com", 2000);
		Employee e3 = new Employee(113, "ghi", "ghi@gmail.com", 3000);
		Employee e4 = new Employee(114, "jkl", "jkl@gmail.com", 4000);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		tran.commit();
		
		session.close();
		sf.close();
		
		
	}
}
