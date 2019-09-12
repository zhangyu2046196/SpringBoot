package com.youyuan.springboot.cache;

import com.youyuan.springboot.cache.bean.Employee;
import com.youyuan.springboot.cache.config.MyRedisConfig;
import com.youyuan.springboot.cache.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01CacheApplicationTests {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;//单独抽出的针对字符串的操作

	@Autowired
	private RedisTemplate redisTemplate; // 针对所有类型的操作

	@Autowired
	private RedisTemplate myRedisTemplate ; //自定义redistemplate指定了序列化格式

	@Test
	public void redisTest(){
		//stringRedisTemplate.opsForValue().set("reS","测试");
		Employee emp = employeeMapper.getEmpById(2);
		myRedisTemplate.opsForValue().set("emp_03",emp);
	}


	@Test
	public void contextLoads() {
		//Employee emp = employeeMapper.getEmpById(1);
		//System.out.println(emp);
	}

}

