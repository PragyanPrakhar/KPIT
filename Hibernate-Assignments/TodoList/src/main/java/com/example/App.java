package com.example;

import com.example.TodoService.TodoService;
import com.example.model.Todo;
import com.example.util.HibernateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoService todoDAO = new TodoService();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("\n1. Add Todo\n2. View Todos\n3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Task: ");
                String task = scanner.nextLine();

                System.out.print("Enter Due Date (yyyy-MM-dd): ");
                String dueDateStr = scanner.nextLine();
                Date dueDate = null;

                try {
                    dueDate = dateFormat.parse(dueDateStr);
                } catch (Exception e) {
                    System.out.println("Invalid date format!");
                    continue;
                }

                Todo todo = new Todo(task, dueDate);
                todoDAO.saveTodo(todo);
                System.out.println("Todo added successfully!");

            } else if (choice == 2) {
                List<Todo> todos = todoDAO.getAllTodos();
                for (Todo t : todos) {
                    System.out.println("ID: " + t.getId() + " | Task: " + t.getTask() + " | Due Date: " + dateFormat.format(t.getDueDate()));
                }
            } else {
                
                System.out.println("Shutting down Hibernate...");
                HibernateUtil.shutdown(); 
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
