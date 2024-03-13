package com.chang.utils.activemq;

import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @description ActiveMQ消息生产者
 * @author zhy
 * @date 2019年6月20日 下午16:57:54
 * @Copyright 版权所有 (c)
 * @memo 无备注说明
 */
@Component
public class ActiveMQTopicPublisher {
    private final static Logger logger = LoggerFactory.getLogger(ActiveMQTopicPublisher.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发布主题消息
     */
    public void publishMsg(String destinationName, String message) {
        if(destinationName.indexOf("topic")==-1){
            logger.error("请规范命名：{},以topic为主题前缀",destinationName);
            return;
        }
        logger.info("发布了一条主题{},消息{}。", destinationName, message);
        Destination destination = new ActiveMQTopic(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}

