package Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class SelectAll_Criteria {
 public static void main(String[] args) {
	
	 Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		List<Employee> list = criteria.list();
		
		System.out.println(list.toString());
		
		session.close();
		sf.close();
		
		
		
}
}
