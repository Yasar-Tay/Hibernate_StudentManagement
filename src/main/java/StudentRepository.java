import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentRepository {

    //Repository class
    Configuration configuration = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class);
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();


    public void registerStudent(Student newStudent) {

        session.save(newStudent);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
