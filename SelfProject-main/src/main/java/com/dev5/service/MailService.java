package com.dev5.service;

import com.dev5.domain.Message;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("Ben Mail servisiyim , sana msj gönderiyorum :"+message.getMessage());
    }
}
