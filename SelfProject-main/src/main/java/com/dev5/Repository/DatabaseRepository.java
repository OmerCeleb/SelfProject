package com.dev5.Repository;

import com.dev5.domain.Message;
import org.springframework.stereotype.Component;

@Component("DatabaseRepository")
public class DatabaseRepository implements Repository{
    @Override
    public void saveMessage(Message message) {
        System.out.println("Mesajinizi  Database'e kaydedildi"+message.getMessage());
    }
}
