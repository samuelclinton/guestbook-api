package com.samvkn.guestbook.repositories;

import com.samvkn.guestbook.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findBySignature(String signature);

    Message findMessageById(Long id);

    @Query(value = "SELECT * FROM messages ORDER BY RAND() LIMIT 1;", nativeQuery = true)
    Message getRandomMessage();
}
