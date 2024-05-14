package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Question;

import java.util.List;

public interface QuestionService {
    Question createQuestion(Question question);
    List<Question> readQuestion();
    Question updateQuestion(Long id,Question question);
    String DeleteQuestion(Long id);
    Question getQuestionById(Long id);
}
