package com.syx.springboot.config.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * RabbitMq发送api
 *
 * @author Msater Zg
 * @create 2017-12-10 12:52
 */
@Component
public class SenderMq {
    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     * 消息推送方法
     * @param messageContent
     */
    public void sendMessageByRabbitMq(String messageContent) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.QUEUE_NAME, messageContent);
    }
}
