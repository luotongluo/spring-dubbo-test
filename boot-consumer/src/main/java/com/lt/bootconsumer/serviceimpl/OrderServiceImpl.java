package com.lt.bootconsumer.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.lt.bootinterface.bean.Address;
import com.lt.bootinterface.bean.User;
import com.lt.bootinterface.order.service.OrderService;
import com.lt.bootinterface.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tong.luo
 * @description OrderServiceImpl
 * @date 2021/1/5 14:58
 */
@DubboService
@Component
public class OrderServiceImpl implements OrderService {
    private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @DubboReference
    private UserService userService;

    /**
     * initAddresses
     *
     * @return
     */
    @Override
    public List<Address> initAddresses() {
        List<User> userInfo = userService.getUserInfo();
        logger.info("user info :{}", JSON.toJSONString(userInfo));
        Address address = new Address("123", new Date());
        List<Address> addresses = new ArrayList<>();;
        addresses.add(address);
        return addresses;
    }
}
