package com.mybatis.demo.mybatisdemo;

import com.mybatis.demo.mybatisdemo.dao.UserMapper;
import com.mybatis.demo.mybatisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user.getRealName());
        }
    }

}
