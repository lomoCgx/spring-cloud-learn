package com.mq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topicqueue_two")
public class TopicReceiver2 {

	@RabbitHandler
    public void process(String hello) {
        
        try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//睡眠1秒。循环300次就是300秒也就是五分钟
        System.out.println("topicqueue_two  : " + hello);
    }
}
