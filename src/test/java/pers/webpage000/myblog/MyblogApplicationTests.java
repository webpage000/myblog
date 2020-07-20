package pers.webpage000.myblog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.webpage000.myblog.mapper.UserMapper;

@SpringBootTest
class MyblogApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.queryByID("1");
    }

}
