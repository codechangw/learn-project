package com.example.demo01.mapper;

import com.example.demo01.entity.Mqtest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname MqtestMapper
 * @Description TODO
 * @Date 2023/10/11 15:37
 * @Author ChangWang
 */
@Mapper
public interface MqtestMapper {
    /**
     * 根据id查询用户信息
     * @param c1
     * @return
     */
    Mqtest getUserInfo(String c1);
    /**
     * 新增用户
     * @param mqtest
     * @return
     */
    int save (Mqtest mqtest);

    /**
     * 更新用户信息
     * @param mqtest
     * @return
     */
    int update (Mqtest mqtest);

    /**
     * 根据id删除
     * @param c1
     * @return
     */
    int deleteByC1 (String c1);

    /**
     * 查询所有用户信息
     * @return
     */
    List<Mqtest> selectAll ();
}
