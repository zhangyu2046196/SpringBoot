package com.youyuan.springboot.amqp.service;

import com.youyuan.springboot.amqp.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 接收消息的监听器
 * @date 2018/12/21 22:23
 */
@Service
public class ReciveMsgService {

    /**
     * 指定监听的队列名，可以传一个数组
     * @param book 队列消息实体
     */
    @RabbitListener(queues = "atguigu")
    public void reciveMsg(Book book){
        System.out.println("接收到消息:"+book);
    }
}
