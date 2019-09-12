package com.youyuan.providerticket.controller;

import com.youyuan.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 服务提供者
 * @date 2018/12/28 20:39
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.ticket();
    }
}
