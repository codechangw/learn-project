package com.example.emailtest.service;

import java.util.Map;

/**
 * @Classname MailService
 * @Description TODO
 * @Date 2023/10/10 19:00
 * @Author ChangWang
 */
public interface MailService {
    void sendSimpleMailMessge(String to, String subject, String content);
    void sendMimeMessge(String to, String subject, String content);
    void sendMimeMessge(String to, String subject, String content, String filePath);
    void sendMimeMessge(String to, String subject, String content, Map<String, String> rscIdMap);

}
