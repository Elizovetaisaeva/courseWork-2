package org.example.coursework2.service;

import org.example.coursework2.entity.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestion(int amount);


}
