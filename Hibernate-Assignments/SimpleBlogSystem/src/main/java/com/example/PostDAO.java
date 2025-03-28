package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.models.Post;
import com.example.utils.HibernateUtil;

public class PostDAO {
    public void savePost(Post post) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(post);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
