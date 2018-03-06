package com.mq.demo.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;
	
	public void sendDirectOne() {
        String context = "sendDirectOne cgx " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchangeDirectTest", "direct.Queue.key1", context);
    }
    
    public void sendDirectTwo() {
        String context = "sendDirectTwo cgx " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchangeDirectTest", "direct.Queue.key2", context);
    }
}
