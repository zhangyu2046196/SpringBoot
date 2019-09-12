package com.youyuan.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 服务提供者方法
 * @date 2018/12/28 20:38
 */
@Service
public class TicketService {

    public String ticket(){
        System.out.println("8001");
        return "《厉害了，我的国》";
    }
}
