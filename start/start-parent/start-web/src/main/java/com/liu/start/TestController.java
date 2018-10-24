package com.liu.start;

import com.alibaba.fastjson.JSON;
import com.liu.start.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liufangrui on 2018/10/24.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/index")
    @ResponseBody
    public User index(){
        User user = new User();
        user.setAge(18);
        user.setName("wade");
        return user;
    }
}
