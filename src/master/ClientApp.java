package master;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ClientApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setName("Soham");
		student.setRoll(150);
		
		SessionFactory sessfact=new Configuration().configure().buildSessionFactory();
		Session session=sessfact.openSession();
		session.beginTransaction();
		session.save(student);
	  // session.save(sd2);
		session.getTransaction().commit();
	}

}
