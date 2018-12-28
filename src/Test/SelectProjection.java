package Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class SelectProjection {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
			cfg.configure("resources/hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			
			Projection proj = Projections.property("name");
	
			criteria.setProjection(proj);
			List<String> list = criteria.list();
			System.out.println(list.toString());
			
			Criteria criteria1 = session.createCriteria(Employee.class);
			Projection proj1 = Projections.property("email");
			ProjectionList plist = Projections.projectionList();
			plist.add(proj);
			plist.add(proj1);
			criteria1.setProjection(plist);
			
			List<Object[]> list1 = criteria1.list();
			
			for(Object[] obj:list1){
				System.out.println(obj[0]+" "+obj[1]);
			}
			
			
			session.close();
			sf.close();
			
			
	}
}
