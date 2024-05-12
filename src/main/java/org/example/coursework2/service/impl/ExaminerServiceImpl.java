package org.example.coursework2.service.impl;

import org.example.coursework2.entity.Question;
import org.example.coursework2.exception.QuestionsAmoutExceededException;
import org.example.coursework2.service.ExaminerService;
import org.example.coursework2.service.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public abstract class ExaminerServiceImpl implements ExaminerService {
    private static final Random random = new Random();

    private final List<QuestionService> questionServices;



    public ExaminerServiceImpl(List<QuestionService> questionServices) {
        this.questionServices = questionServices;

    }

    @Override
    public Collection<Question> getQuestion(int amount) {
                return Stream.generate(this::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }

    private Question getRandomQuestion() {
        int ind = random.nextInt(questionServices.size());
        return questionServices.get(ind).getRandom();

        }


    }

