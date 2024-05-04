package org.example.coursework2.service;

import org.example.coursework2.entity.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(Question question);

    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandom();
}
