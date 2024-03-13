package com.example.demo01.mapper;

import com.example.demo01.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2023/10/11 12:34
 * @Author ChangWang
 */
@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserInfo(int id);
    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
}
