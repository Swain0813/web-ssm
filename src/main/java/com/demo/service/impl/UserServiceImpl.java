package com.demo.service.impl;

import com.demo.dao.TUserDao;
import com.demo.dao.UserDao;
import com.demo.entity.TUserEntity;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private TUserDao tUserDao;
    @Resource
    private UserDao userDao;

//    public User getUserById(Long userId) {
//        return userDao.selectUserById(userId);
//    }
//
//    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
//        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
//    }
    
    public List<TUserEntity> getAllUser() {
        return tUserDao.selectAll();
    }
}
