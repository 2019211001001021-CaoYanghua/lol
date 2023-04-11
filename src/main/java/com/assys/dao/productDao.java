package com.assys.dao;

import com.assys.domian.product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface productDao {
    @Select("select * FROM product  ORDER BY sales DESC LIMIT 5")
    public List<product> findHot();
}
