package com.springmvc.service;

import com.springmvc.model.Login;
import com.springmvc.model.User;

/**
 * Created by naren on 10/14/2017.
 */
public interface UserService {
   User validateUser(Login login);
    void register(User user);

}
