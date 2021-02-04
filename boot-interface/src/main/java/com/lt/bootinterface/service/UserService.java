package com.lt.bootinterface.service;

import com.lt.bootinterface.bean.User;

import java.util.List;

/**
 * @author tong.luo
 * @description UserService
 * @date 2021/1/5 10:53
 */
public interface UserService {
    /**
     * test --》 getUserInfo
     * @return
     */
    public List<User> getUserInfo();
}
