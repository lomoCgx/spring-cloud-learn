package com.mq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topicqueue_one")
public class TopicReceiver1 {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("topicqueue_one  : " + hello);
    }
}
