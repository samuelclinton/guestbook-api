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

    // Find all messages on route "/"
    @GetMapping
    public ResponseEntity<List<MessageDTO>> findAll() {
        List<MessageDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    // Find all by signature route using request params
    @GetMapping("/messages/by-signature")
    @ResponseBody
    public ResponseEntity<List<MessageDTO>> findAllBySignature(@RequestParam String signature) {
        List<MessageDTO> list = service.findAllBySignature(signature);
        return ResponseEntity.ok(list);
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