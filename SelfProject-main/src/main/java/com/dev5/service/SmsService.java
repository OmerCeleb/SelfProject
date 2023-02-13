package com.dev5.service;

import com.dev5.domain.Message;
import org.springframework.stereotype.Component;

@Component("smsSevice")
public class SmsService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("Ben Sms servisiyim , sana msj gönderiyorum :"+message.getMessage());
    }
}
