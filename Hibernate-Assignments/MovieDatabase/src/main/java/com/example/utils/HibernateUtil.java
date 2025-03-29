package com.example.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.example.models.Movie;
import com.example.models.Genre;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Movie.class)
                    .addAnnotatedClass(Genre.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Error in creating Session Factory: " + e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
