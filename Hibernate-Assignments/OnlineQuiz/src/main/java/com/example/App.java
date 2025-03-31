package com.example;

import com.example.dao.QuestionDAO;
import com.example.models.Question;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        QuestionDAO questionDAO = new QuestionDAO();

        // Adding questions
        Question q1 = new Question("What is the capital of France?", Arrays.asList("Paris", "London", "Berlin", "Madrid"));
        Question q2 = new Question("Which planet is known as the Red Planet?", Arrays.asList("Earth", "Mars", "Venus", "Jupiter"));

        questionDAO.saveQuestion(q1);
        questionDAO.saveQuestion(q2);

        // Fetch and display all questions
        List<Question> questions = questionDAO.getAllQuestions();
        for (Question question : questions) {
            System.out.println("Q: " + question.getText());
            System.out.println("Options: " + question.getOptions());
        }
    }
}
