package com.springmvc.service;

import com.springmvc.dao.UserDao;
import com.springmvc.model.Login;
import com.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by naren on 10/14/2017.
 */
public class UserServiceImpl implements UserService{
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    UserDao userDao;

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

    public void register(User user) {
        userDao.register(user);
    }
}
