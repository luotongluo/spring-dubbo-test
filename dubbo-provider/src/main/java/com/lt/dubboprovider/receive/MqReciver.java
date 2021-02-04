package com.lt.dubboprovider.receive;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author tong.luo
 * @description MqReciver
 * @date 2021/1/5 15:59
 */
@Component
public class MqReciver {
    private static Logger logger = LoggerFactory.getLogger(MqReciver.class);

    @RabbitHandler
    @RabbitListener(queues = "user.save.queue.name")
    public void receiveMessage(@Payload String message, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag,
                               Channel channel) {
        logger.info("消息接收成功，用户名为：" + message);
        //可以添加自定义业务逻辑处理
        try {
            channel.basicAck(deliveryTag,true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
