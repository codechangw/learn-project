package com.chang.utils.activemq;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

/**
 * @Classname TopicListener
 * @Description TODO
 * @Date 2023/10/13 10:41
 * @Author ChangWang
 */
@Component
public class TopicListener {

    @JmsListener(destination = "${ActiveMQ.topicTest1}", containerFactory = "jmsListenerContainerTopic")
    public void receive(Message message){
        ActiveMQTextMessage objectMsg = (ActiveMQTextMessage)message;
        String msg ="";
        try {
            msg = message.toString();
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

