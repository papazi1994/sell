package com.immoc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Create by 小玄 on 2021/6/21 上午2:34
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;
    //库存
    private  Integer productStock;

    private String productDescription;

    private String productIcon;
    //状态，0正常，1下架
    private  Integer productStatus;

    private  Integer categoryType;





}
