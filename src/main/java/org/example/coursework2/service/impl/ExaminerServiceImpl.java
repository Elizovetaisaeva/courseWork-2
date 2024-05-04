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
public class ExaminerServiceImpl implements ExaminerService {
    private static final Random random = new Random();

    private final QuestionService javaQuestionService;
    private final QuestionService mathQuestionService;


    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService javaQuestionService,
                               @Qualifier("mathQuestionService") QuestionService mathQuestionService) {

        this.javaQuestionService =javaQuestionService;
        this.mathQuestionService = mathQuestionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        return List.of();
    }

    @Override
    public Collection<Question> getquestion(int amount) {
        if (javaQuestionService.getAll().size() + mathQuestionService.getAll().size()<amount) {
            throw new QuestionsAmoutExceededException();
        }
        return Stream.generate(this::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
    private Question getRandomQuestion() {
        int ind = random.nextInt(2);
        if (ind == 0) {
            return javaQuestionService.getRandom();
        } else {
            return mathQuestionService.getRandom();
        }
    }
}
