package controller;

import model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping ("/exam/java")
public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }
    @GetMapping ("/add")
    Question addQuestion (String question, String answer){
        return null;
    }


    @GetMapping ("/remove")
    Question removeQuestion (String question, String answer){
        return null;
    }


    @GetMapping
    Collection <Question> getQuestions () {
        return null;
    }




}
