package pers.webpage000.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pers.webpage000.myblog.mapper.UserMapper;

/**
 * @author 王思涵
 * @Description
 * @time 2020/6/6 0:39
 **/
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
}
