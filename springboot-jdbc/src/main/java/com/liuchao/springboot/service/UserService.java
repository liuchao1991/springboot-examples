package com.liuchao.springboot.service;

/**
 * 用户业务接口
 *
 * @author liuchao
 * @date 2018/7/13 16:56
 */
public interface UserService {
    /**
     * 保存用户
     *
     * @param name 姓名
     * @param age 年龄
     * @return
     */
    void save(String name, Integer age);

    /**
     * 删除用户
     *
     * @param name 姓名
     * @return
     */
    void deleteByName(String name);

    /**
     * 获取用户总数
     *
     * @return
     */
    Integer getAllUsers();

    /**
     * 清空用户
     *
     * @return
     */
    void deleteAllUsers();

}
