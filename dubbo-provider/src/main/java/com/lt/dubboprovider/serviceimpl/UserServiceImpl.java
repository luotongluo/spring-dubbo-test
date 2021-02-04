package com.lt.dubboprovider.serviceimpl;

import com.lt.bootinterface.bean.User;
import com.lt.bootinterface.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tong.luo
 * @description UserServiceImpl
 * @date 2021/1/5 10:57
 */
@DubboService
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserInfo() {
        User user = new User("123", new Date());
        List<User> list = new ArrayList();
        list.add(user);
        return list;
    }
}
