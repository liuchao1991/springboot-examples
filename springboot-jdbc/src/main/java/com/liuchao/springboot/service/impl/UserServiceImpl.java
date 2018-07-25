package com.liuchao.springboot.service.impl;

import com.liuchao.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户业务类
 *
 * @author liuchao
 * @date 2018/7/13 16:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO USER (NAME, AGE) VALUES (?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM USER WHERE NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("SELECT COUNT(1) FROM USER", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM USER");
    }
}
