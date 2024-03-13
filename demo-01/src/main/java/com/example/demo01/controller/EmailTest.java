package com.example.demo01.controller;

import com.example.demo01.service.MailService;
import com.example.demo01.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname EmailTest
 * @Description TODO
 * @Date 2023/10/10 12:57
 * @Author ChangWang
 */
@RestController
@RequestMapping("/mail")
public class EmailTest {

    @Autowired
    private MailUtils mailUtils;
    @Autowired
    private MailService mailService;
    private static final String TO = "1579565441@qq.com";
    private static final String SUBJECT = "测试邮件";
    private static final String CONTENT = "test content";
    /**
     * 发送文本邮件
     * @param to
     * @param subject
     * @param text
     */
    @RequestMapping("/sendTextMail")
    public void sendTextMail(String to,String subject,String text){
        mailUtils.sendTextMailMessage(to,subject,text);
    }
    @RequestMapping("/test")
    public void sendSimpleMailMessage() {
        mailService.sendSimpleMailMessge(TO, SUBJECT, CONTENT);
    }
}
