package com.samvkn.guestbook.services;

import com.samvkn.guestbook.dtos.MessageDTO;
import com.samvkn.guestbook.entities.Message;
import com.samvkn.guestbook.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repo;

    // Find all messages method
    public List<MessageDTO> findAll() {
        List<Message> list = repo.findAll();
        return list.stream().map(x -> new MessageDTO(x)).collect(Collectors.toList());
    }

    // Find all messages by specific signature
    public List<MessageDTO> findAllBySignature(String signature) {
        List<Message> list = repo.findBySignature(signature);
        return list.stream().map(x -> new MessageDTO(x)).collect(Collectors.toList());
    }

    // Save a new message method
    public void save(MessageDTO message) {
        Message newMessage = new Message(message);
        repo.save(newMessage);
    }

    // Delete a message by id
    public void delete(Long id) {
        repo.deleteById(id);
    }
}