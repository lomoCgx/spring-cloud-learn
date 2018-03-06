package com.mq.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;

@Configuration
public class RabbitConfig {

	/**
	 * 服务端发布分3步
	 * 1.new 一个队列（queue）       
	 * 2.创建一个交换机
	 * 3.把交换机与队列进行绑定
	 */
	
	
	
    /** 消息交换机的名字*/  
    public static final String EXCHANGE_DIRECT = "exchangeDirectTest";  
    public static final String EXCHANGE_Topic = "exchangeTopicTest"; 
    
    /** 队列key1*/  //*表示一个词,#表示零个或多个词
    public static final String ROUTINGKEYTOPIC1 = "topic.#";  
    /** 队列key2*/  
    public static final String ROUTINGKEYTOPIC2 = "topic.Queue.key2"; 
    
    /** 队列key1*/  
    public static final String ROUTINGKEY1 = "direct.Queue.key1";  
    /** 队列key2*/  
    public static final String ROUTINGKEY2 = "direct.Queue.key2";  
	
	/**  
    1.定义direct exchange，绑定queueTest  
    2.durable="true" rabbitmq重启的时候不需要创建新的交换机  
    3.direct交换器相对来说比较简单，匹配规则为：如果路由键匹配，消息就被投送到相关的队列  
    fanout交换器中没有路由键的概念，他会把消息发送到所有绑定在此交换器上面的队列中。  
    topic交换器你采用模糊匹配路由键的原则进行转发消息到队列中  
    key: queue在该direct-exchange中的key值，当消息发送给direct-exchange中指定key为设置值时，消息将会转发给queue参数指定  
    的消息队列  
    * 
    */  
   @Bean  
   public DirectExchange directExchange(){  
       DirectExchange directExchange = new DirectExchange(RabbitConfig.EXCHANGE_DIRECT,true,false);  
       return directExchange;  
   }
   @Bean
   public TopicExchange topicExchange() {
	   TopicExchange topicExchange = new TopicExchange(RabbitConfig.EXCHANGE_Topic, true, false);
	   return topicExchange;
   }
   
   /**  
    *   durable="true" 持久化 rabbitmq重启的时候不需要创建新的队列  
    *   auto-delete 表示消息队列没有在使用时将被自动删除 默认是false  
    *    exclusive  表示该消息队列是否只在当前connection生效,默认是false
    */  
	@Bean
	public Queue directQueue_one() {
		Queue queue = new Queue("directqueue_one",true,false,false);  
        return queue; 
	}
	@Bean
	public Queue directQueue_two() {
		Queue queue = new Queue("directqueue_two",true,false,false);  
        return queue; 
	}
	/**
	 * topic交换器你采用模糊匹配路由键的原则进行转发消息到队列中  
	 * @return
	 */
	@Bean
	public Queue topicQueue_one() {
		Queue queue = new Queue("topicqueue_one",true,false,false);  
        return queue; 
	}
	@Bean
	public Queue topicQueue_two() {
		Queue queue = new Queue("topicqueue_two",true,false,false);  
        return queue; 
	}
  
    /**
     * 将消息队列directQueue和交换机directExchange进行绑定
     * @return
     */
	 @Bean  
	 public Binding binding_one() {  
        return BindingBuilder.bind(directQueue_one()).to(directExchange()).with(RabbitConfig.ROUTINGKEY1);  
	 } 
	 @Bean  
	 public Binding binding_tow() {  
        return BindingBuilder.bind(directQueue_two()).to(directExchange()).with(RabbitConfig.ROUTINGKEY2);  
	 } 
	 @Bean  
	 public Binding binding_Topicone() {  
        return BindingBuilder.bind(topicQueue_one()).to(topicExchange()).with(RabbitConfig.ROUTINGKEYTOPIC1);  
	 } 
	 @Bean  
	 public Binding binding_Topictow() {  
        return BindingBuilder.bind(topicQueue_two()).to(topicExchange()).with(RabbitConfig.ROUTINGKEYTOPIC2);  
	 }
	 
	 
	@Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
	
	@Bean
    public Queue oneToManyQueue() {
        return new Queue("oneToMany");
    }
}
