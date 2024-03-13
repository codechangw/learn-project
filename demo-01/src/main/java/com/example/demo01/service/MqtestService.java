package com.example.demo01.service;

import com.example.demo01.entity.Mqtest;
import com.example.demo01.entity.User;
import com.example.demo01.mapper.MqtestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname MqtestService
 * @Description TODO
 * @Date 2023/10/11 15:49
 * @Author ChangWang
 */
@Service
public class MqtestService {
    @Autowired
    MqtestMapper mqtestMapper;

    public Mqtest save(Mqtest mqtest) {
        int save = mqtestMapper.save(mqtest);
        return mqtest;
    }

    public List<Mqtest> selectAll() {
        return mqtestMapper.selectAll();
    }
}
