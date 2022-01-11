package com.loginapp.login.dao;

import com.loginapp.util.dao.DAO;
import com.loginapp.login.entities.LoginUser;

import java.util.List;

public interface LoginUserDAO extends DAO {
    long insertLoginUser(LoginUser loginUser);
    boolean updateLoginUser(LoginUser loginUser);
    boolean deleteLoginUser(LoginUser loginUser);

    LoginUser searchUser(String userName, String password, String division);
    List<LoginUser> findAll();
}
