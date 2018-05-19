package com.demo.service;

import com.demo.dao.TUserDao;
import com.demo.entity.TUserEntity;
import com.demo.entity.User;

import java.util.List;

public interface UserService {

    List<TUserEntity> getAllUser();

//    User getUserByPhoneOrEmail(String emailOrPhone, Short state);
//
//    User getUserById(Long userId);
}
