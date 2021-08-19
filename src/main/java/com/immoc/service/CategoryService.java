package com.immoc.service;

import com.immoc.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 小玄 on 2021/6/21 上午3:44
 */
@Service
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

   // ProductCategory save(ProductCategory productCategory);
}
