package com.liuchao.springboot;

import com.liuchao.springboot.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcApplicationTests {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        // 清空user表
        userService.deleteAllUsers();
    }

	@Test
	public void test() {
        // 插入5个用户
        userService.save("刘一", 21);
        userService.save("陈二", 22);
        userService.save("张三", 23);
        userService.save("李四", 24);
        userService.save("王五", 25);

        // 查数据库，应该有5个用户
        Assert.assertEquals(6, userService.getAllUsers().intValue());

        // 删除2个用户
        userService.deleteByName("刘一");
        userService.deleteByName("陈二");

        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userService.getAllUsers().intValue());
	}

}
