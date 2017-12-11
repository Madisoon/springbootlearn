package com.syx.springboot.config.rabbitmq;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * 描述:
 * Receiver
 *
 * @author Msater Zg
 * @create 2017-12-06 17:13
 */
@Component
public class Receiver {

    /**
     * CountDownLatch是一个同步辅助类，犹如倒计时计数器，创建对象时通过构造方法设置初始值，
     * 调用CountDownLatch对象的await()方法则处于等待状态，调用
     * countDown(),方法就将计数器减1，当计数到达0时，则所有等待者或单个等待者开始执行。
     */
    private CountDownLatch latch = new CountDownLatch(1);

    /**
     * 监听方法
     *
     * @param message
     */
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        System.out.println("监听到了");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
