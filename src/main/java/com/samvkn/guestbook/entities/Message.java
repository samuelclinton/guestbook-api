package com.samvkn.guestbook.entities;

import com.samvkn.guestbook.dtos.MessageDTO;

import javax.persistence.*;


@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 240)
    private String message;

    @Column(nullable = false, length = 50)
    private String signature;

    public Message() {}

    public Message(String message, String signature) {
        this.message = message;
        this.signature = signature;
    }

    public Message(MessageDTO entity) {
        message = entity.getMessage();
        signature = entity.getSignature();
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}