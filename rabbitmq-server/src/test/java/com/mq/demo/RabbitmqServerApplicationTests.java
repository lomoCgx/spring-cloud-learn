package com.mq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mq.demo.sender.DirectSender;
import com.mq.demo.sender.HelloSender;
import com.mq.demo.sender.TopictSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqServerApplicationTests {

	@Test
	public void contextLoads() {
		helloSender.sendHello();
	}

	@Test
	public void oneTomanyTest() {
		for (int i = 0; i < 10; i++) {
			helloSender.sendOneToMany(i);
		}
		
	}
	
	
	@Test
	public void sendDirect() {
		directSender.sendDirectOne();
		directSender.sendDirectTwo();
	}
	@Test
	public void sendtopic() {
		topicSender.sendTopicOne();
		topicSender.sendTopicTwo();
	}

    @Autowired
    private TopictSender topicSender;
    @Autowired
    private HelloSender helloSender;
    
    @Autowired
    private DirectSender directSender;
}
