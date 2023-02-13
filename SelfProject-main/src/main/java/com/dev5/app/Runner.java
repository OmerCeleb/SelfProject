package com.dev5.app;

import com.dev5.AppConfiguration;
import com.dev5.Repository.Repository;
import com.dev5.domain.Message;
import com.dev5.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        Message message=new Message();
        message.setMessage("Siprais verildi!");

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageService serviceMessage = context.getBean("mailService", MessageService.class);
        serviceMessage.sendMessage(message);

        Repository rp=context.getBean("DatabaseRepository", Repository.class);
        rp.saveMessage(message);
        context.close();
    }
}
