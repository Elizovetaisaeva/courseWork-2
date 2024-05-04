package org.example.coursework2.service.impl;

import org.example.coursework2.entity.Question;
import org.example.coursework2.exception.NotUniqueQuestionException;
import org.example.coursework2.repository.QuestionRepository;
import org.example.coursework2.repository.impl.JavaQuestionRepository;
import org.example.coursework2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Random random = new Random();
    private QuestionRepository questionRepository;

    public JavaQuestionService(JavaQuestionRepository  questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(Question question) {
        return questionRepository.aaddQuestion(question);

    }

    @Override
    public Question add(String question, String answer) {
        return questionRepository.aaddQuestion(new Question(question, answer));

    }

    @Override
    public Question remove(Question question) {
        return questionRepository.removeQuestion(question);

    }

    @Override
    public Collection<Question> getAll() {

        return questionRepository.getAll();
    }

    @Override
    public Question getRandom() {
        int ind = random.nextInt(questionRepository.getAll().size());
        return questionRepository.getAll().get(ind);

    }
}
