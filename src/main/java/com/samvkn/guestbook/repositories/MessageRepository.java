package com.samvkn.guestbook.repositories;

import com.samvkn.guestbook.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    public List<Message> findBySignature(String signature);
}
