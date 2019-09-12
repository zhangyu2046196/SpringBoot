package com.youyuan.springbootconfig;

import com.youyuan.springbootconfig.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private ApplicationContext ioc;

	@Test
	public void getBean(){
		boolean isExist=ioc.containsBean("helloService");
		System.out.println(isExist);
	}

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
