package com.youyuan.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangyu
 * @version 1.0
 * @description 卖票实现类
 * @date 2018/12/28 14:15
 *
 * @Component 需要注册到容器中
 * @Service 使用dubbo的service注解 用于发布服务
 *
 */
@Component
@Service
public class ProviderTicketImpl implements ProviderTicket {
    @Override
    public String sale() {
        return "《富贵兵团》";
    }
}
