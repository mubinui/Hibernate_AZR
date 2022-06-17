package Introduction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Project Started ..............>");
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
//        factory.getCurrentSession();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        // Creating teacher
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher(sc.nextInt(),sc.next(), sc.nextLine());
        System.out.println(teacher);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(teacher);
        tx.commit();
        session.close();
    }
}
