package repository;

import domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentRepository {

    //Repository class
    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();
    }


    public void registerStudent(Student newStudent) {

        Session session = null;
        Transaction transaction = null;


        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Business logic
            session.save(newStudent);

            // Commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback in case of failure
            }
            e.printStackTrace();
        } finally {
            // Ensure session is closed
            if (session != null) {
                session.close();
            }
        }
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }


}
