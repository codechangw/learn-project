package com.chang.utils.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;

/**
 * @Title: ActiveMQConfig.java
 * @Package com.zhy.springboot.activemq
 * @Description: ActiveMQ配置类
 * @author John_Hawkings
 * @date 2018年12月28日
 * @version V1.0
 */
@Configuration
public class ActiveMQConfig{

    @Value("${spring.activemq.user}")
    private String usrName;

    @Value("${spring.activemq.password}")
    private  String password;

    @Value("${spring.activemq.broker-url}")
    private  String brokerUrl;

    @Bean("connectionFactory")
    public ActiveMQConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(usrName, password, brokerUrl);
    }

    @Bean("jacksonJmsMessageConverter")
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }

    @Bean("jmsTemplate")
    JmsTemplate jmsTemplate(@Qualifier("jacksonJmsMessageConverter")MessageConverter jacksonJmsMessageConverter,@Qualifier("connectionFactory") ConnectionFactory connectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setMessageConverter(jacksonJmsMessageConverter);
        //设置优先级，0最低，9最高
        jmsTemplate.setPriority(9);
        return jmsTemplate;
    }

    @Bean("jmsMessagingTemplate")
    JmsMessagingTemplate jmsMessagingTemplate(@Qualifier("jacksonJmsMessageConverter")MessageConverter jacksonJmsMessageConverter,@Qualifier("jmsTemplate") JmsTemplate jmsTemplate) {
        JmsMessagingTemplate messagingTemplate = new JmsMessagingTemplate(jmsTemplate);
        messagingTemplate.setJmsMessageConverter(jacksonJmsMessageConverter);
        return messagingTemplate;
    }

    @Bean("jmsListenerContainerQueue")
    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(@Qualifier("connectionFactory")ActiveMQConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(connectionFactory);
        //设置消息转换器
        bean.setMessageConverter(jacksonJmsMessageConverter());
        return bean;
    }

    @Bean("jmsListenerContainerTopic")
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(@Qualifier("connectionFactory")ActiveMQConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        //设置为发布订阅方式, 默认情况下使用的生产消费者方式
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(connectionFactory);
        //设置消息转换器
        bean.setMessageConverter(jacksonJmsMessageConverter());
        return bean;
    }


}

