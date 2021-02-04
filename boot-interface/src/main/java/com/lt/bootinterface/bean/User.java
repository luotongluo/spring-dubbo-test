package com.lt.bootinterface.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tong.luo
 * @description User
 * @date 2021/1/5 10:54
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4832914362975071400L;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public User(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
