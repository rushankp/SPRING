package com.springmvc.dao;

/**
 * Created by naren on 10/12/2017.
 */
import com.springmvc.model.Login;
import com.springmvc.model.User;
public interface UserDao {
    void register(User user);
    User validateUser(Login login);
}