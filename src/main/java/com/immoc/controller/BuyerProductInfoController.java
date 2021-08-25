package com.immoc.controller;
import com.immoc.VO.ProductInfoVO;
import com.immoc.VO.ProductVO;
import com.immoc.VO.ResultVO;
import com.immoc.dataobject.ProductInfo;
import com.immoc.service.CategoryService;
import com.immoc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/buyer/product")
public class BuyerProductInfoController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
    //1.查询所有上架的商品
      List<ProductInfo> productInfoList = productService.findUpAll();
     //2. 查询类目(一次性查询)
//      List<Integer> categoryTypeList = new ArrayList<>();
     //传统方法
//       for (ProductInfo productInfo: productInfoList) {
//       categoryTypeList.add(productInfo.getCategoryType());
//       }
        //精简方法
        List<Integer> categoryTypeList =  productInfoList.stream().map(e -> e.getCategoryType())
                        .collect(Collectors.toList());
        categoryService.findByCategoryTypeIn(categoryTypeList);
       //3.数据拼接.

        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(2);
        resultVO.setMsg("成功") ;


        return resultVO;

    }


}
