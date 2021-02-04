package com.lt.bootconsumer.controller;

import com.alibaba.fastjson.JSON;
import com.lt.bootinterface.bean.Address;
import com.lt.bootinterface.order.service.OrderService;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tong.luo
 * @description TestController
 * @date 2021/1/5 15:03
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @DubboReference
    private OrderService orderService;

    @RequestMapping("testInterface")
    public String testInterface(){
        List<Address> addresses = this.orderService.initAddresses();
        if(CollectionUtils.isNotEmpty(addresses)){
            return JSON.toJSONString(addresses);
        }else {
            return null;
        }
    }
}
