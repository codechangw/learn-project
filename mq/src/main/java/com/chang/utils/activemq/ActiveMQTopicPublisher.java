package com.chang.utils.activemq;

import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @description ActiveMQ消息生产者
 */
@Component
public class ActiveMQTopicPublisher {
    private final static Logger logger = LoggerFactory.getLogger(ActiveMQTopicPublisher.class);

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发布主题消息
     */
    public void publishMsg(String destinationName, String message) {
        if (destinationName.indexOf("topic") == 0) {
            logger.error("请规范命名：{},以topic为主题前缀", destinationName);
            return;
        }
        logger.info("发布了一条主题{},消息{}。", destinationName, message);
        Destination destination = new ActiveMQTopic(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}

