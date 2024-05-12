package org.example.coursework2.controller;

import org.example.coursework2.entity.Question;
import org.example.coursework2.service.QuestionService;
import org.example.coursework2.service.impl.MathQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")
public class MathQuestionController {
    private final QuestionService questionService;

    public MathQuestionController( MathQuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add(String question, String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

    @GetMapping("/remove")
    public Question remove(String question,String answer) {
        return questionService.remove(new Question(question, answer));
    }
}

