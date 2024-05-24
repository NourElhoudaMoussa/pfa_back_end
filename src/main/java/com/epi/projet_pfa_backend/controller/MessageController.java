package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.MessageService;
import com.epi.projet_pfa_backend.modele.Actualite;
import com.epi.projet_pfa_backend.modele.Message;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Message")
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/createMessage")
    public Message createMessage(@RequestBody Message message){
        return messageService.createMessage(message);
    }
    @GetMapping("/getAllMessage")
    public List<Message> readMessage(){
        return messageService.readMessage();
    }

    @PutMapping("/updateMessage/{id}")
    public Message updateMessage(@PathVariable Long id,@RequestBody Message message){
        return messageService.updateMessage(id,message);
    }
    @DeleteMapping("/DeleteMessage/{id}")
    public String DeleteMessage(@PathVariable Long id){
        return messageService.DeleteMessage(id);
    }

   @GetMapping("/getMessageById/{id}")
    public Message getMessageById(@PathVariable Long id){
        return messageService.getMessageById(id);
    }

}
