package com.wuying.controller;

import com.wuying.cloud.context.holder.ApplicationContextHolder;
import com.wuying.entity.User;
import com.wuying.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wuying
 * @since 1.0.0
 * @date 2021-09-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        return userMapper.selectList(null);
    }
}
