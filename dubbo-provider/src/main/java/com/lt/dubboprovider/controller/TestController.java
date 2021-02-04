package com.lt.dubboprovider.controller;

import com.alibaba.fastjson.JSON;
import com.lt.bootinterface.bean.User;
import com.lt.bootinterface.service.UserService;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tong.luo
 * @description TestController
 * @date 2021/1/6 14:21
 */
@RestController
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    public String getUser() {
        List<User> userInfo = this.userService.getUserInfo();
        if (CollectionUtils.isNotEmpty(userInfo)) {
            return JSON.toJSONString(userInfo);
        } else {
            return null;
        }
    }
}
