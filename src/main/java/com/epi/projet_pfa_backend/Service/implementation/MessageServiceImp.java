package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.MessageService;
import com.epi.projet_pfa_backend.modele.Message;
import com.epi.projet_pfa_backend.repository.ActualiteRepository;
import com.epi.projet_pfa_backend.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class MessageServiceImp implements MessageService {
    private final MessageRepository messageRepository;
    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> readMessage() {
        return messageRepository.findAll();
    }

    @Override
    public Message updateMessage(Long id, Message message) {
        return messageRepository.findById(id)
                .map(msg->{
                    msg.setReponse(message.getReponse());
                    msg.setResponsable(message.getResponsable());
                    msg.setIntervention(message.getIntervention());

                    return messageRepository.save(msg);
                }).orElseThrow(()->new RuntimeException("message non trouvé !!"));
    }

    @Override
    public String DeleteMessage(Long id) {
        messageRepository.deleteById(id);
        return "message supprimé avec succées";
    }

    @Override
    public Message getMessageById(Long id) {
        return  messageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("message non trouvé!!"));
    }
}
