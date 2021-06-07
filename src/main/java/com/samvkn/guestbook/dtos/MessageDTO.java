package com.samvkn.guestbook.dtos;

import com.samvkn.guestbook.entities.Message;

import java.io.Serializable;

public class MessageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String message;
    private String signature;

    public MessageDTO() {
    }

    public MessageDTO(String message, String signature) {
        this.message = message;
        this.signature = signature;
    }

    public MessageDTO(Long id, String message, String signature) {
        this.id = id;
        this.message = message;
        this.signature = signature;
    }

    public MessageDTO(Message entity) {
        id = entity.getId();
        message = entity.getMessage();
        signature = entity.getSignature();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
