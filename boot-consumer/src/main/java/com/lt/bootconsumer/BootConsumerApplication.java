package com.lt.bootconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tong.luo
 */
// 开启基于注解的dubbo功能（主要是包扫描@DubboComponentScan）
// 也可以在配置文件中使用dubbo.scan.base-package来替代   @EnableDubbo
@EnableDubbo
@SpringBootApplication
public class BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApplication.class, args);
    }

}
