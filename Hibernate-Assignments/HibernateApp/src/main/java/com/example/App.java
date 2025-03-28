package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.model.Certificate;
import com.example.model.Student;
import com.example.util.HibernateUtil;

// import jakarta.transaction.Transaction;
// import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );

        Student student = new Student();
        student.setName("Sumit Sinha");
        student.setCollege("IIT Bombay");
        student.setPhone("95431985");
        student.setFathername("Suman Sinha");
        student.setIsActive(true);
        student.setAbout("One More Student");

        Certificate certificate=new Certificate();
        certificate.setStudent(student);
        certificate.setTitle("Java");
        certificate.setAbout("Java Certificate");
        certificate.setLink("https://www.javatpoint.com/java-tutorial");

        Certificate certificate2 = new Certificate();
        certificate2.setStudent(student);
        certificate2.setTitle("Python");
        certificate2.setAbout("Python Certificate");
        certificate2.setLink("https://www.javatpoint.com/python-tutorial");


        student.getCertificates().add(certificate);
        student.getCertificates().add(certificate2);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(student);
            System.out.println("Student saved successfully");
            transaction.commit();
            

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        // System.out.println("Session Factory created::" + sessionFactory);
    }
}
