package controller;


import model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping
public class ExamController {
    private  final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }


    @GetMapping
    public Collection<Question> getQuestions(int amount){
        return examinerService.getQuestions(5)  ;
    }
}
