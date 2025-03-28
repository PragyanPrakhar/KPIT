package com.example.TodoService;

import java.util.*;
import org.hibernate.Session;

import com.example.model.Todo;
import com.example.util.HibernateUtil;

import org.hibernate.Transaction;

public class TodoService {

    // Here I am saving the todo
    public void saveTodo(Todo todo) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.beginTransaction();
            session.persist(todo);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Here I am getting the list of all the todos saved in the database
    public List<Todo> getAllTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Todo", Todo.class).list();
        }
    }

    // Here I am fetching the todo by its id.
    public void deleteTodoById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.beginTransaction();
            Todo todo = session.get(Todo.class, id);
            if (todo != null) {
                session.remove(todo);
            }
            trans.commit();
        }
    }
}
