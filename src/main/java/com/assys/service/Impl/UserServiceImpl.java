package com.assys.service.Impl;

import com.assys.dao.UserDao;
import com.assys.domian.User;
import com.assys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public boolean login(String phone, String password) {
        return userDao.login(phone, password) > 0;
    }

    @Override
    public boolean register(User user) {
        return userDao.createUser(user) > 0;
    }

    @Override
    public boolean selectByPhone(String phone) {
        return userDao.selectByPhone(phone) > 0;
    }
}
