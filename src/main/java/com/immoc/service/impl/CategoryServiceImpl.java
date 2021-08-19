package com.immoc.service.impl;

import com.immoc.dataobject.ProductCategory;
import com.immoc.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 小玄 on 2021/6/21 上午3:49
 */
@Service
public class CategoryServiceImpl implements CategoryService {


    @Override
    public ProductCategory findOne(Integer categoryId) {
        return null;
    }

    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return null;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return null;
    }
}
