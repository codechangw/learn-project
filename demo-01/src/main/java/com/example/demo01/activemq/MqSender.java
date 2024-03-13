package com.example.demo01.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * @Classname MqSender
 * @Description TODO
 * @Date 2023/10/11 16:26
 * @Author ChangWang
 */
@Component
public class MqSender {

    public static ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER,
            ActiveMQConnectionFactory.DEFAULT_PASSWORD,
            "tcp://localhost:61616");


    public static void sender(String message) throws Exception {
//        // 1. 获取连接工厂
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(
//                ActiveMQConnectionFactory.DEFAULT_USER,
//                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
//                "tcp://localhost:61616"
//        );

        // 2. 获取一个向activeMq的连接
        Connection connection = factory.createConnection();
        // 3. 获取session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // 4.找目的地，获取destination，消费端，也会从这个目的地取消息
        Queue queue = session.createQueue("mqtest");

        // 5.1 消息创建者
        MessageProducer producer = session.createProducer(queue);

        // consumer --> 消费者
        // producer --> 创建者
        // 5.2. 创建消息
        TextMessage textMessage = session.createTextMessage("message" + message);
        System.out.println("发送消息------------------");
        // 5.3 向目的地写入消息
        producer.send(textMessage);

        // 6.关闭连接
        connection.close();

        System.out.println("结束。。。。。");

    }
}
