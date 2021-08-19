package com.immoc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.immoc.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    @JsonProperty("name")
    private  String categoryName;

    @JsonProperty("type")
    private  String catrgoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;



}
