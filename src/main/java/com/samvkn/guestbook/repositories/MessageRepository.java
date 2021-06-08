package com.samvkn.guestbook.repositories;

import com.samvkn.guestbook.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    public List<Message> findBySignature(String signature);

    //@Query("SELECT new com.samvkn.guestbook.dtos.MessageDTO(obj.message, obj.signature) FROM Message AS obj " +
    //       "ORDER BY RAND() LIMIT 1;")
    @Query(value = "SELECT * FROM messages ORDER BY RAND() LIMIT 1;", nativeQuery = true)
    public Message getRandomMessage();
}
