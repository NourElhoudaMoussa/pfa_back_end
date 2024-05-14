package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Message;

import java.util.List;

public interface MessageService {
    Message createMessage(Message message);
    List<Message> readMessage();
    Message updateMessage(Long id,Message message);
    String DeleteMessage(Long id);
    Message getMessageById(Long id);
}
