package com.youyuan.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 异步任务业务类
 * @date 2018/12/27 15:49
 */
@Service
public class AsyncService {

    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理中......");
    }
}
