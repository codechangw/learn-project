package com.example.demo01.controller;

import com.example.demo01.activemq.MqSender;
import com.example.demo01.entity.Mqtest;
import com.example.demo01.service.MqtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname MqtestController
 * @Description TODO
 * @Date 2023/10/11 15:50
 * @Author ChangWang
 */

@RestController
@RequestMapping("/test2")
public class MqtestController {
    @Autowired
    MqtestService mqtestService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Mqtest> ListUser() {
        return mqtestService.selectAll();
    }

    //   插入
    //    http://localhost:8080/testBoot/insert?c1=100&c2=波波&c3=123456&c4=lalala
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Mqtest insert(Mqtest mqtest) {
        try {
            MqSender.sender(mqtest.toString());
        } catch (Exception e) {
            System.out.println("发送消息失败");
            e.printStackTrace();
        }
        return mqtestService.save(mqtest);
    }
}
