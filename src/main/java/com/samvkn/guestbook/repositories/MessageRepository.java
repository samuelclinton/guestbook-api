package com.samvkn.guestbook.repositories;

import com.samvkn.guestbook.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
