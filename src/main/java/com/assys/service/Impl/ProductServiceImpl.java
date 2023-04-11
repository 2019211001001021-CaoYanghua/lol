package com.assys.service.Impl;

import com.assys.dao.productDao;
import com.assys.domian.product;
import com.assys.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements productService {

    @Autowired
    private productDao productDao;

    @Override
    public List<product> findHot() {
        return productDao.findHot();
    }
}
