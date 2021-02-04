package com.lt.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * // 开启基于注解的dubbo功能（主要是包扫描@DubboComponentScan）
 * // 也可以在配置文件中使用dubbo.scan.base-package来替代   @EnableDubbo
 *
 * @author tong.luo
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
    @Resource
    RedisTemplate redisTemplate;

    public static void main(String[] args) {
//        this.redisTemplate.opsForHash().increment();
        SpringApplication.run(DubboProviderApplication.class, args);

    }

}
