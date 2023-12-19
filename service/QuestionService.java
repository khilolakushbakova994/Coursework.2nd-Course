package service;

import model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add (String question, String answer);

    Question addOnlyQuestion (Question question);

    Question remove (Question question);

    Collection <Question> getAll ();

    Question getRandomQuestion ();

}
