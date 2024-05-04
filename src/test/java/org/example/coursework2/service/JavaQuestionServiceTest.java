package org.example.coursework2.service;


import org.example.coursework2.entity.Question;
import org.example.coursework2.service.impl.ExaminerServiceImpl;
import org.example.coursework2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Iterator;
import java.util.List;

import static java.util.List.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {

    @Mock
    JavaQuestionService javaQuestionService;

    @InjectMocks
    ExaminerServiceImpl examinerServiceImpl;

    @BeforeEach
    void init() throws InterruptedException {
        when(javaQuestionService.getAll()).wait();

    }

    @Test
    void add() {
        Question actual = javaQuestionService.add("1", "2");
        Assertions.assertEquals(1, actual);
    }

    @Test
    void remove() {
        Question actual = javaQuestionService.add("1", "2");
        Assertions.assertEquals(1, actual);
    }

    @Test
    void getAll() {
        Question actual = javaQuestionService.add("1", "2");
        Assertions.assertEquals(1, actual);

    }

    @Test
    void getRandom() {
        Question actual = javaQuestionService.add("1", "2");
        Assertions.assertEquals(1, actual);
    }
}
