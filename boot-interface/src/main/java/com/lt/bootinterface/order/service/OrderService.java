package com.lt.bootinterface.order.service;


import com.lt.bootinterface.bean.Address;

import java.util.List;

/**
 * @author tong.luo
 * @description OrderService
 * @date 2021/1/5 14:54
 */
public interface OrderService {
    /**
     * initAddresses
     *
     * @return
     */
    public List<Address> initAddresses();
}
