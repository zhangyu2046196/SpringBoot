package com.youyuan.springboot.amqp;

import com.youyuan.springboot.amqp.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02AmqpApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private AmqpAdmin amqpAdmin;//管理rabbitmq组件

	/**
	 * 单播测试方法
	 */
	@Test
	public void contextLoads() {
		//发送消息 需要将消息封装成message 实体bean
		//rabbitTemplate.send(exchange,routKey,message);

		//转换并发送消息
		//rabbitTemplate.convertAndSend(exchange,routKey,obj);

		Map<String,Object> map=new HashMap<String,Object>();
		map.put("msg","发送rabbitmq的单播测试数据");
		map.put("content", Arrays.asList("北京",123456,true));
		//rabbitTemplate.convertAndSend("exchange.direct","atguigu",map);
		rabbitTemplate.convertAndSend("exchange.direct","atguigu",new Book("西游记","吴承恩"));

	}

	/**
	 * 测试接收消息
	 */
	@Test
	public void reciveMsg(){
		Object obj=rabbitTemplate.receiveAndConvert("atguigu");
		System.out.println(obj.getClass());
		System.out.println(obj);
	}

	/**
	 * 测试分发消息信息
	 */
	@Test
	public void sendFanout(){
		rabbitTemplate.convertAndSend("exchange.fanout","",new Book("三国演义","罗贯中"));
	}


	/**
	 * 创建交换机
	 */
	@Test
	public void createExchange(){
		Exchange exchange=new DirectExchange("youyuan");
		amqpAdmin.declareExchange(exchange);
	}

	/**
	 * 创建队列
	 */
	@Test
	public void createQueue(){
		amqpAdmin.declareQueue(new Queue("youyuan.queue"));
	}

	/**
	 * 创建绑定关系
	 */
	@Test
	public void createBinding(){
		Binding binding=new Binding("youyuan.queue",Binding.DestinationType.QUEUE,"youyuan","test_binding",null);
		amqpAdmin.declareBinding(binding);
	}

}

