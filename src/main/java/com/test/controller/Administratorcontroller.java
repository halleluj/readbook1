package com.test.controller;

import com.test.pojo.Administrator;
import com.test.pojo.Result;
import com.test.service.Administratorservice;
import com.test.utils.Md;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Administratorcontroller")
@Controller
public class Administratorcontroller {
     @Autowired
 private    Administratorservice administratorservice;

     @PostMapping("/Login")
     @ResponseBody
     @CrossOrigin
     public Result<Object> login(String username,String password){
         return MessageUtil.success(administratorservice.login(username, Md.Encrypted_MD5(password)));
     }
     @GetMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public  Result<Object> insert(Administrator administrator){
         return MessageUtil.success(administratorservice.insert(administrator));
     }

}
