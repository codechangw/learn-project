package com.cw.kafka.consumer;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author c.w
 * @className Consumer
 * @description
 * @date 2024/07/16
 **/
public class ConsumerTest {
    public static void main(String[] args) {
        //  创建配置对象
        Map<String, Object> consumerConfig = new HashMap<>();
        consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerConfig.put(ConsumerConfig.GROUP_ID_CONFIG, "cwTest");
        //  创建消费者对象
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(consumerConfig);
        //  订阅主题
        consumer.subscribe(Collections.singletonList("test"));
        //  从kafka主题获取数据
        //      消费者从kafka拉取数据
        while (true) {
            ConsumerRecords<String, String> dates = consumer.poll(100);
            for (ConsumerRecord<String, String> record : dates) {
                System.out.println(record);
            }
        }

        //  关闭消费者对象
        //consumer.close();
    }
}


