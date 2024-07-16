package com.cw.kafka.producer;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author c.w
 * @className Test01
 * @description
 * @date 2024/07/16
 **/
public class ProducerTest {
    public static void main(String[] args) {
        //  1. 创建配置对象
        Map<String, Object> configMap = new HashMap<>();
        configMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        //  2. 对生产的数据K,V 进行序列化的操作
        configMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        configMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //  3. 创建生产者对象
        //      生产者对象需要设定泛型,
        KafkaProducer<String, String> producer = new KafkaProducer<>(configMap);
        //  4. 创建数据
        for (int i = 0; i < 10; i++) {
            ProducerRecord<String, String> record = new ProducerRecord<String, String>("test", "hello" + i, "kafka" + i);
            //  5. 生产者发送数据
            producer.send(record);
        }
        //  6. 关闭生产者
        producer.close();
    }
}


