package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存错误"),
    ORDER_NOT_EXIST(12,"订单不存在"),
    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),
    ORDER_STATUS_ERROR(14,"订单状态不正确"),
    ORDER_UPDATE_FAIL(15,"订单更新失败"),
    ORDER_DETAIL_EMPTY(16,"订单中无商品"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),
    PARAM_ERROR(18,"创建订单参数不对"),
    CART_EMPTY(19,"购物车不能为空"),
    ORDER_OWNER_ERROR(20,"该订单不属于当前用户"),
    WXCHAT_MP_ERROR(21,"微信公众号错误"),
   ;
    private Integer code;

    private  String message;

    ResultEnum(Integer code , String message) {
        this.code = code;
        this.message = message;
    }

}