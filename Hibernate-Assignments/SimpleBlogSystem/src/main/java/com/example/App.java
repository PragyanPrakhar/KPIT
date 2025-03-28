package com.example;

import com.example.models.Post;
import com.example.models.User;
import com.example.utils.HibernateUtil;

public class App {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        // PostDAO postDAO = new PostDAO();

        User user = new User("John Doe");
        Post post1 = new Post("This is my first post!");
        Post post2 = new Post("Hello, Hibernate!");

        user.addPost(post1);
        user.addPost(post2);

        userDAO.saveUser(user);

        HibernateUtil.shutdown(); 
    }
}