package service;

import model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }
}
