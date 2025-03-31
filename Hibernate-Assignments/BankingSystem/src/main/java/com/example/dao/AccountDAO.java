package com.example.dao;

import com.example.models.Account;
import com.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountDAO {

    public void saveAccount(Account account) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(account);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public Account getAccount(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Account.class, id);
        }
    }

    public void updateAccount(Account account) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(account);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteAccount(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Account account = session.get(Account.class, id);
            if (account != null) {
                session.remove(account);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
