package com.test.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.pojo.Result;
import com.test.pojo.User;
import com.test.service.UserserviceImpl;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Controller
@RequestMapping("/Usercontroller")
//@RestController
public class Usercontroller {
    @Autowired
    private UserserviceImpl userservice;

    @GetMapping("/addUserInfo")
    @ResponseBody
    @CrossOrigin
    public JSON addUserInfo(User user){
        return userservice.addUserInfo(user);
    }

    @GetMapping("/deleteUserInfo")
    @ResponseBody
    @CrossOrigin
    public JSON deleteUserInfo(int id){
        return userservice.deleteUserInfo(id);
    }

    @GetMapping("/updateUserInfo")
    @ResponseBody
    @CrossOrigin
    public JSON updateUserInfo(User user){
        return userservice.updateUserInfo(user);
    }

    @GetMapping("/updateUserInfobyuid")
    @ResponseBody
    @CrossOrigin
    public JSON updateUserInfobyuid(User user){
        return userservice.updateUserInfobyuid(user);
    }

    @GetMapping("/selectUserInfo")
    @ResponseBody
    @CrossOrigin
    public User selectUserInfo(int id){
        User user=new User();
        user.setId(id);
        return userservice.selectUserInfo(id);
    }

    @GetMapping("/selectUserInfos")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectUserInfos(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        int page1 = page-1;
        int page2 = page1*limit;
       return MessageUtil.success(userservice.selectUserInfos(page2, limit));
    }

    @GetMapping("/selectUID")
    @ResponseBody
    @CrossOrigin
      public Result<Object> selectUID(String UID){
        return MessageUtil.success(userservice.selectUID(UID));
    }

}
