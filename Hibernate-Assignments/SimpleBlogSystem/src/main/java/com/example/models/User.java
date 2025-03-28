package com.example.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User(String name, List<Post> posts) {
        this.name = name;
        this.posts = posts;
    }

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    // Constructors, Getters, and Setters
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void addPost(Post post) {
        posts.add(post);
        post.setUser(this);
    }
    public void removePost(Post post) {
        posts.remove(post);
        post.setUser(null);
}
}
