package com.chang.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * @Classname activemq.config.MqApplication
 * @Description TODO
 * @Date 2023/10/12 18:29
 * @Author ChangWang
 */
@EnableJms
@SpringBootApplication
public class MqApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqApplication.class, args);
    }
}
