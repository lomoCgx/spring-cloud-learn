package com.mq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "directqueue_one")
public class DirectReceiver {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}
