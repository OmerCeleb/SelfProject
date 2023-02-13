package com.dev5.service;

import com.dev5.domain.Message;
import org.springframework.stereotype.Component;

@Component("whatsAppService")
public class WhatsAppService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("Ben whatssupp servisiyim , sana msj gönderiyorum :"+message.getMessage());
    }
}
