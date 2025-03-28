package com.example;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.models.User;
import com.example.utils.HibernateUtil;

public class UserDAO {
    public  void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
