package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.MessageService;
import com.epi.projet_pfa_backend.modele.Message;

import java.util.List;

public class MessageServiceImp implements MessageService {
    @Override
    public Message createMessage(Message message) {
        return null;
    }

    @Override
    public List<Message> readMessage() {
        return List.of();
    }

    @Override
    public Message updateMessage(Long id, Message message) {
        return null;
    }

    @Override
    public String DeleteMessage(Long id) {
        return "";
    }

    @Override
    public Message getMessageById(Long id) {
        return null;
    }
}
