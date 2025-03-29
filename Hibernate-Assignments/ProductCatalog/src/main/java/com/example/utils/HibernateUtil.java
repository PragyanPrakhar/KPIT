package com.example.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.models.Category;
import com.example.models.Product;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Category.class) // Explicitly add the class
                    .addAnnotatedClass(Product.class).buildSessionFactory();
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
