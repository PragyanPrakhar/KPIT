package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.model.Student;
import com.example.util.HibernateUtil;

import org.hibernate.query.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
// import org.hibernate.query.criteria.JpaCriteriaQuery;

import java.util.*;

public class StudentService {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    // save
    public void saveStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction beginTransaction = session.beginTransaction();
            session.persist(student);
            beginTransaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // get By Id
    public Student getById(long studentId) {
        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, studentId);
            return student;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // update
    public Student updateStudent(long studentId, Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction beginTransaction = session.beginTransaction();
            Student oldStudent = session.get(Student.class, studentId);
            if (oldStudent != null) {
                oldStudent.setName(student.getName());
                oldStudent.setCollege(student.getCollege());
                oldStudent.setPhone(student.getPhone());
                oldStudent.setFathername(student.getFathername());
                oldStudent.setAbout(student.getAbout());
                oldStudent = session.merge(oldStudent);
            }
            beginTransaction.commit();
            return oldStudent;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // delete
    public void deleteStudent(long studentId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction beginTransaction = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.remove(student);
            }
            beginTransaction.commit();
        }
    }

    // HQL(Hibernate Query Language) ---> native query

    // Getting all the students using HQL

    public List<Student> getAllStudentsHQL() {
        try (Session session = sessionFactory.openSession()) {
            String getHQL = "FROM Student";
            List<Student> students = session.createQuery(getHQL, Student.class).list();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get the Student by name using HQL.
    public List<Student> getStudentByName(String name) {
        try (Session session = sessionFactory.openSession()) {
            String getHQL = "FROM Student WHERE name=:name";
            List<Student> students = session.createQuery(getHQL, Student.class).setParameter("name", name).list();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // criteria api : Database Independent Query

    // get all the students of the same college
    public List<Student> getStudentByCollegeCriteria(String college) {
        try (Session session = sessionFactory.openSession()) {
            HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
            Root<Student> root = query.from(Student.class);
            query.select(root).where(criteriaBuilder.equal(root.get("college"), college));
            List<Student> students = session.createQuery(query).list();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Student> getStudentWithPagination(int pageNo , int pageSize){
        try(Session session = sessionFactory.openSession()){
            String pagiQuery="FROM Student";
            Query<Student> query = session.createQuery(pagiQuery,Student.class);

            query.setFirstResult((pageNo-1)*pageSize);
            query.setMaxResults(pageSize);
            return query.list();
        }
    }

}
