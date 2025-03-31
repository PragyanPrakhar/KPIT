package com.example.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    // Here I am using @ElementCollection to store a list of options for the
    // question in a separate table called answers with a foreign key question_id.
    @ElementCollection(fetch = FetchType.EAGER) 
    @CollectionTable(name = "answers", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;

    // Constructors
    public Question() {
    }

    public Question(String text, List<String> options) {
        this.text = text;
        this.options = options;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}