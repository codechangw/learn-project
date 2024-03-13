package com.chang.utils.test;

import com.alibaba.fastjson.JSON;
import com.chang.utils.activemq.ActiveMQQueueProducer;
import com.chang.utils.activemq.ActiveMQTopicPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname testController
 * @Description TODO
 * @Date 2023/10/12 18:39
 * @Author ChangWang
 */
@Controller
public class testController {

    @Value("${ActiveMQ.queueEmail}")
    private String queueEmail;

    @Value("${ActiveMQ.topicTest1}")
    private String topicTest1;

    @Autowired
    private ActiveMQQueueProducer queueProducer;
    @Autowired
    private ActiveMQTopicPublisher topicPublisher;

    @GetMapping("/mqTest")
    public String test(String mes) {
        String jsonStr = JSON.toJSONString(mes);
        queueProducer.sendMsg(queueEmail, mes);
        topicPublisher.publishMsg(topicTest1, mes);
        return "ok";
    }
}
