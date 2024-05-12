package org.example.coursework2.repository;

import org.example.coursework2.entity.Question;

import java.util.Collection;
import java.util.List;

public interface QuestionRepository {
    Question aaddQuestion(Question question);
    Question removeQuestion(Question question);

    Question add(Question question);

    Question remove(Question question);

    List<Question> getAll();
}
