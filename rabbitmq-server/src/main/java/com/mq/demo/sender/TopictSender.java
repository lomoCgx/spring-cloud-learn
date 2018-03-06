package com.mq.demo.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopictSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;
	
	public void sendTopicOne() {
        String context = "sendTopicOne cgx " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchangeTopicTest", "topic.Queue.key1", context);
    }
    
    public void sendTopicTwo() {
        String context = "sendTopicTwo cgx " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchangeTopicTest", "topic.Queue.key2", context);
    }
}
