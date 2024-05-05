package org.example.coursework2.service.impl;

import org.example.coursework2.entity.Question;
import org.example.coursework2.exception.NotImplementedException;
import org.example.coursework2.repository.QuestionRepository;
import org.example.coursework2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
public class MathQuestionService implements QuestionService {

    private final Random random = new Random();


    @Override
    public Question add(Question question) {
        throw new NotImplementedException();

    }

    @Override
    public Question add(String question, String answer) {
        throw new NotImplementedException();

    }

    @Override
    public Question remove(Question question) {
        throw new NotImplementedException();

    }

    @Override
    public Collection<Question> getAll() {
        throw new NotImplementedException();
    }

    @Override
    public Question getRandom() {
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int operation = random.nextInt(4);
        switch (operation) {
            case 0 -> new Question(a + "+" + b, String.valueOf(a + b));
            case 1 -> new Question(a + "-" + b, String.valueOf(a - b));
            case 2 -> new Question(a + "*" + b, String.valueOf(a * b));
            case 3 -> new Question(a + "/" + b, String.valueOf(a / b));
            default -> throw new IllegalStateException();

        };
        return null;
    }
}



