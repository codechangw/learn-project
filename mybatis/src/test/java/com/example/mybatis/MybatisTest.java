package com.example.mybatis;

import com.example.mybatis.entity.Good;
import com.example.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.List;

/**
 * @Classname MybatisTest
 * @Description ??Mybatis?? SqlSessionFactory ?? SqlSessionFactoryBuilder?????
 * @Date 2023/9/21 17:53
 * @Author ChangWang
 */
public class MybatisTest {
    @Test
    public void testSqlSessionFactory() {
        try {
            // get??????Resources??????????????????????AsReader???????????????????
            // Resources.getResourceAsReader()?????????????????class???��????????????xml?????
//            idea  ????????????????????��????????????????????ctrl ?????????????????????????��?��???????????????
            Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
            // ?????SqlSessionFactory??????????mybatis-config.xml?????
            // SqlSessionFactoryBuilder?????????????????��????????????SqlSessionFactory????
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println("SessionFactory????????");
            try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
                // ????SqlSession????SqlSession?????????????????????
                Connection connection = sqlSession.getConnection();
                System.out.println(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // ?????mybatis-config.xml?��?<dataSource type="POOLED">???????????????close???????????????????��?
            // ?????mybatis-config.xml?��?<dataSource type="UNPOOLED">???????????????close???????Connection.close()????????
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMyBatisUtils() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            if (sqlSession != null) {
                MyBatisUtils.closeSession(sqlSession);
            }
        }
    }

    @Test
    public void testMapper() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.openSession();
            List<Good> list = sqlSession.selectList("good.selectAll");
            for (Good g : list) {
                System.out.println(g.getG_name());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (sqlSession != null) {
                MyBatisUtils.closeSession(sqlSession);
            }
        }
    }

    @Test
    public void testGoodMapperSelectGoodByID() {

        SqlSession session = null;
        try {
            session = MyBatisUtils.openSession();
            Good good = session.selectOne("good.selectGoodByID", 4);
            System.out.println(good.getG_name());
        } catch (Exception e) {
            throw e;
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }
}
