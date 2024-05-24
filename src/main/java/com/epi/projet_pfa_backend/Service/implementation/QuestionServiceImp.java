package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.QuestionService;
import com.epi.projet_pfa_backend.modele.Question;
import com.epi.projet_pfa_backend.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@AllArgsConstructor
@Service
public class QuestionServiceImp implements QuestionService {
    private final QuestionRepository questionRepository;
    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> readQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question updateQuestion(Long id, Question question) {
        return questionRepository.findById(id)
                .map(q->{
                    q.setQuestion(question.getQuestion());
                    q.setSondage(question.getSondage());
                    q.setReponses(question.getReponses());

                    return questionRepository.save(q);
                }).orElseThrow(()->new RuntimeException("question non trouvé !!"));
    }

    @Override
    public String DeleteQuestion(Long id) {
        questionRepository.deleteById(id);
        return "question supprimé avec succées";
    }

    @Override
    public Question getQuestionById(Long id) {
        return  questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("question non trouvé!!"));
    }
}
