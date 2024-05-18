package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.QuestionService;
import com.epi.projet_pfa_backend.modele.Question;

import java.util.List;

public class QuestionServiceImp implements QuestionService {
    @Override
    public Question createQuestion(Question question) {
        return null;
    }

    @Override
    public List<Question> readQuestion() {
        return List.of();
    }

    @Override
    public Question updateQuestion(Long id, Question question) {
        return null;
    }

    @Override
    public String DeleteQuestion(Long id) {
        return "";
    }

    @Override
    public Question getQuestionById(Long id) {
        return null;
    }
}
