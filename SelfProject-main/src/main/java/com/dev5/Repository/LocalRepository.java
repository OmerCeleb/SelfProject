package com.dev5.Repository;

import com.dev5.domain.Message;
import org.springframework.stereotype.Component;

@Component("LocalRepository")
public class LocalRepository implements Repository{
    @Override
    public void saveMessage(Message message) {
        System.out.println("Mesajinizi  locale kaydedildi"+message.getMessage());
    }
}
