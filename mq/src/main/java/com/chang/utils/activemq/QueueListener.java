package com.chang.utils.activemq;

import com.alibaba.fastjson.JSON;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.Message;

/**
 * @Classname QueueListener
 * @Description TODO
 * @Date 2023/10/13 10:03
 * @Author ChangWang
 */
@Component
public class QueueListener {
    @JmsListener(destination = "ActiveMQ.queueEmail", containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.queue") //双向队列
    public String receive(Message message){
        ActiveMQTextMessage objectMsg = (ActiveMQTextMessage)message;
        String msg ="";
        try {
            msg = message.toString();
            System.out.println("receive: "+msg);
            return "------------------>我已成功接收到队列信息,queueEmail";
        } catch (Exception e) {
            e.printStackTrace();
            return "我这边处理异常啦";
        }
    }
}
