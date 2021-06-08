package com.samvkn.guestbook.controllers;

import com.samvkn.guestbook.dtos.MessageDTO;
import com.samvkn.guestbook.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MessageService service;

    // Get all messages on route "/"
    @GetMapping
    public ResponseEntity<List<MessageDTO>> findAll() {
        List<MessageDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    // Get message by id route
    @GetMapping("/messages/{id}")
    @ResponseBody
    public ResponseEntity<MessageDTO> findMessageById(@PathVariable(value = "id") String id) {
        MessageDTO message = service.findMessageById(Long.parseLong(id));
        return ResponseEntity.ok(message);
    }

    // Get all by signature route using request params
    @GetMapping("/messages/by-signature")
    @ResponseBody
    public ResponseEntity<List<MessageDTO>> findAllBySignature(@RequestParam String signature) {
        List<MessageDTO> list = service.findAllBySignature(signature);
        return ResponseEntity.ok(list);
    }

    // Get random message route
    @GetMapping("/messages/random")
    public ResponseEntity<MessageDTO> getRandomMessage() {
        MessageDTO randomMessage = service.getRandomMessage();
        return ResponseEntity.ok(randomMessage);
    }

    // Add new message route under "/messages/new" using JSON body
    @PostMapping("/messages/new")
    @ResponseBody
    public ResponseEntity<MessageDTO> save(@RequestBody MessageDTO message) {
        service.save(message);
        return ResponseEntity.ok(message);
    }

    // Add new message route under "/messages/new" using request params
    @GetMapping("/messages/new")
    @ResponseBody
    public ResponseEntity<MessageDTO> save(@RequestParam String message,
                                           @RequestParam String signature) {
        MessageDTO newMessage = new MessageDTO(message, signature);
        service.save(newMessage);
        return ResponseEntity.ok(newMessage);
    }

    // Delete message by id method under route "/delete" using request params
    @GetMapping("/messages/delete/{id}")
    @ResponseBody
    public RedirectView delete(@PathVariable(value = "id") String id) {
        service.delete(Long.parseLong(id));

        return new RedirectView("/");
    }
}
