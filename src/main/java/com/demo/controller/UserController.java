package com.demo.controller;

import com.demo.entity.TUserEntity;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<TUserEntity> userList = userService.getAllUser();
        log.info("aaa");
        model.addAttribute("userList",userList);
        return "showUser";
    }
}
