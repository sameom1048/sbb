package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.answer.AnswerService;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Test
    void testJpa() {
        for (int i = 0; i < 100; i++) {
            String subject = String.format("test data:[%03d]", i);
            String content = "empty";
            this.questionService.create(subject, content, null);
        }
    }

}
