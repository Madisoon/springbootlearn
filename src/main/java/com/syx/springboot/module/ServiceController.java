package com.syx.springboot.module;

import com.syx.springboot.config.rabbitmq.SenderMq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Msater Zg
 */
@RestController
public class ServiceController {
    @Autowired
    SenderMq senderMq;

    @GetMapping(value = "/hello")
    String home(HttpServletRequest request) {
        System.out.println("调用了这个方法");
        senderMq.sendMessageByRabbitMq("hello");
        return "";
    }
}
