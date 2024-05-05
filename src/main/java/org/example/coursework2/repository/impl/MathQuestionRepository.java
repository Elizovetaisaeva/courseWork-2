package org.example.coursework2.repository.impl;

import org.example.coursework2.entity.Question;
import org.example.coursework2.exception.NotUniqueQuestionException;
import org.example.coursework2.repository.QuestionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class MathQuestionRepository implements QuestionRepository {
    private final List<Question> questions = new ArrayList<>();

    @Override
    public Question aaddQuestion(Question question) {
        return null;
    }

    @Override
    public Question removeQuestion(Question question) {
        return null;
    }

    @Override
    public Question add(Question question) {
        if (questions.contains(question)){
            throw new NotUniqueQuestionException();
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        } else {
            return null;

        }
    }

    @Override
    public List<Question> getAll() {
        return Collections.unmodifiableList(questions);

    }

}
