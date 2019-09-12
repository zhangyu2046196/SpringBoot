package com.youyuan.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.youyuan.ticket.service.ProviderTicket;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 消费类
 * @date 2018/12/28 14:28
 */
@Component
public class UserService {

    @Reference
    private ProviderTicket providerTicket;

    public void getTicket(){
        System.out.print("买到了");
        providerTicket.sale();
    }

}
