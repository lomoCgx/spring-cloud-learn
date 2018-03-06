package com.mq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "oneToMany")
public class OneToManyReceiver {

	@RabbitHandler
    public void process(String msg) {
        System.out.println("OneToManyReceiver  : " + msg);
    }
}
