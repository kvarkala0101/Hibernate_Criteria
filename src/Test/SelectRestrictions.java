package Test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectRestrictions {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		Criterion criterion = Restrictions.eq("id", 111);
		
		criteria.add(criterion);
		
		Employee employee = (Employee)criteria.uniqueResult();
		
		System.out.println(employee.toString());
		
		session.close();
		sf.close();
		
		
	}
}
