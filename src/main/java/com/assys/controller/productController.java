package com.assys.controller;

import com.assys.domian.product;
import com.assys.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {
    @Autowired
    private productService productService;

    @GetMapping
    public Result findHot(){
        List<product> productsList = productService.findHot();
        return new Result(10004,productsList,null);
    }

}
