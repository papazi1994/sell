package com.immoc.service;

import com.immoc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Create by 小玄 on 2021/6/21 上午3:41
 */
@Service
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(PageRequest pageable);

    ProductInfo save(ProductInfo productInfo);


}
