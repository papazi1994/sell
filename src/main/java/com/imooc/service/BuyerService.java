package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * 买家
 */
@Service
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne (String openid, String orderId);


    //取消订单
    OrderDTO cancelOrder(String openid , String  orderId);


}
