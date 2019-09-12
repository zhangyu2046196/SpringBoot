package com.youyuan.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot04TaskApplicationTests {

	@Autowired
	private JavaMailSenderImpl mailSender;//发送邮件接口

	/**
	 * 发送简单邮件
	 */
	@Test
	public void contextLoads() {
		//简单邮件信息体
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		//标题
		mailMessage.setSubject("通知");
		//内容
		mailMessage.setText("放假通知......");
		//接收邮件地址
		mailMessage.setTo("zhangyu2046196@163.com");
		//发送邮件地址
		mailMessage.setFrom("275399591@qq.com");
		mailSender.send(mailMessage);
	}

	/**
	 * 发送复杂邮件
	 */
	@Test
	public void sendMail() throws MessagingException {
		//创建复杂邮件体
		MimeMessage mimeMessage=mailSender.createMimeMessage();
		//设置邮件内容
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
		//标题
		helper.setSubject("通知");
		//内容
		helper.setText("<b style='color:red'>放假通知......</b>",true);
		//接收邮件地址
		helper.setTo("zhangyu2046196@163.com");
		//发送邮件地址
		helper.setFrom("275399591@qq.com");
		//添加附件信息
		helper.addAttachment("1.jpg",new File("C:\\Users\\YYBJ\\Desktop\\spe.jpg"));
		//发送邮件内容
		mailSender.send(mimeMessage);
	}

}

