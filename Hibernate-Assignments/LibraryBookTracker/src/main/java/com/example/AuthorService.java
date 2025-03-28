package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.model.Author;
import com.example.util.HibernateUtil;

import org.hibernate.Transaction;

public class AuthorService {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public static void saveAuthor(Author author) {
        // code to save author
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(author);
            transaction.commit();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
