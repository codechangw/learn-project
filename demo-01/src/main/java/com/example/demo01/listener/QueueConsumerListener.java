package com.example.demo01.listener;

import com.example.demo01.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueConsumerListener {

    @Autowired
    private MailService mailService;

    //queue模式的消费者
    @JmsListener(destination="${spring.activemq.queueEmail}", containerFactory="queueListener")
    public void readActiveQueue(String message) {
        System.out.println("email queue接受到：" + message);
        mailService.sendSimpleMailMessge(message,"test email","test content2");
    }
}
