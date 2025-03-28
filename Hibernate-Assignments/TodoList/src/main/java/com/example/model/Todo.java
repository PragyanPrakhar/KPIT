package com.example.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "task", nullable = false)
    private String task;

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private Date dueDate;

    public Todo() {
    }

    public Todo(String task, Date dueDate) {
        this.task = task;
        this.dueDate = dueDate;
    }
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}
