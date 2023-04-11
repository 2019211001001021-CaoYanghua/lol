package com.assys.service;

import com.assys.domian.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    public User selectById(int id);

    public boolean login(String phone,String password);

    public boolean register(User user);

    public boolean selectByPhone(String phone);
}
