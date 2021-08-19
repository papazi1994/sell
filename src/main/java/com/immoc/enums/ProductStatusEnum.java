package com.immoc.enums;

import lombok.Getter;

/**
 * Create by 小玄 on 2021/8/2 下午9:36
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架") , DOWN(1,"下架");

    private  Integer code;

    private  String message;

    ProductStatusEnum(Integer code, String  message){
        this.code = code;
        this.message = message;

    }


}
