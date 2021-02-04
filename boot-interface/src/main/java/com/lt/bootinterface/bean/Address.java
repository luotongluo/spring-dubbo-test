package com.lt.bootinterface.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tong.luo
 * @description Address
 * @date 2021/1/5 14:55
 */
public class Address implements Serializable {
    private static final long serialVersionUID = -7081254208568596993L;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    public Address(String name, Date createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
