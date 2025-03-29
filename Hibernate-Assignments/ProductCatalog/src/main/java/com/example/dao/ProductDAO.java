package com.example.dao;

import com.example.models.Category;
import com.example.models.Product;
import com.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ProductDAO {

    public void saveProduct(String productName, String categoryName) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            // Check if category already exists
            Category category = (Category) session.createQuery(
                    "FROM Category WHERE name = :categoryName")
                    .setParameter("categoryName", categoryName)
                    .uniqueResult();

            if (category == null) {
                category = new Category(categoryName);
                session.persist(category); // Save new category
            }

            Product product = new Product(productName, category);
            session.persist(product);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public List<Product> getProductsByCategory(String categoryName) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery(
                    "FROM Product p WHERE p.category.name = :categoryName", Product.class)
                    .setParameter("categoryName", categoryName)
                    .list();
        }
    }
}