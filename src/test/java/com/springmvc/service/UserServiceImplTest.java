package com.springmvc.service;

import com.springmvc.dao.UserDaoImpl;
import com.springmvc.model.Login;
import com.springmvc.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by naren on 10/14/2017.
 */

public class UserServiceImplTest {


    UserDaoImpl userDaoMock = Mockito.mock(UserDaoImpl.class);
    UserServiceImpl  service = new UserServiceImpl();



    @Test
    public void testValidateUser() throws Exception {

        //Given
        Login  login = new Login();
        login.setUsername("narender");
        login.setPassword("password");

        User user = new User();
        user.setUsername("narender");
        user.setPassword("password");

        service.setUserDao(userDaoMock);

        Mockito.when(userDaoMock.validateUser(login)).thenReturn(user);

        //When
        User userObj = service.validateUser(login);

        //Then
        assertNotNull(userObj);

    }

    @Test
    public void testRegister() throws Exception {
        //Given
        User user = new User();
        user.setUsername("narender");
        user.setPassword("password");

        service.setUserDao(userDaoMock);

        userDaoMock.register(user);

        //When
        service.register(user);

        //Then
        assertTrue(true);
    }

}