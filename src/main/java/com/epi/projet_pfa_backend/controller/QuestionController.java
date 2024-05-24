package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.QuestionService;
import com.epi.projet_pfa_backend.modele.Question;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
@AllArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping("/createQuestion")
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    @GetMapping("/getAllQuestion")
    public List<Question> readQuestion() {
        return questionService.readQuestion();
    }

    @PutMapping("/updateQuestion/{id}")
    public Question updateQuestion(@PathVariable Long id, @RequestBody Question question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        return questionService.DeleteQuestion(id);
    }


    @GetMapping("/getQuestionById/{id}")
    public Question getQuestionById(@PathVariable Long id){
        return questionService.getQuestionById(id);
    }
}
