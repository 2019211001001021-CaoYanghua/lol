package com.assys.dao;

import com.assys.domian.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User selectById(Integer id);

    @Update("update user set password = #{password} where id = #{id}")
    public int changePassword(Integer id,String password);

    @Insert("insert into user(username,password,phone,gender,birthDate,address,role)" +
            "values (#{username},#{password},#{phone},#{gender},#{birthDate},#{address},2)")
    public int createUser(User user);

    @Select("select count(*) from user where phone = #{phone} and password = #{password}")
    public int login(String phone,String password);

    @Select("SELECT count(*) from user where phone = #{phone}")
    public int selectByPhone(String phone);
}
