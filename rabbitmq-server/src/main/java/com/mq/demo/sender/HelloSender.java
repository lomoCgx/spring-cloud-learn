package com.mq.demo.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendHello() {
        String context = "hello cgx " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
    
    public void sendOneToMany(int i) {
        String context = "oneToMany "+i + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("oneToMany", context);
    }
}
