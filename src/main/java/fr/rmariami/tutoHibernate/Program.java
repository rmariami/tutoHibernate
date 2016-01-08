package fr.rmariami.tutoHibernate;

import fr.rmariami.tutoHibernate.util.HibernateUtilities;
import org.hibernate.Session;

/**
 * Created by pretender on 07/01/16.
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Hell world");
        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.close();

    }

}
