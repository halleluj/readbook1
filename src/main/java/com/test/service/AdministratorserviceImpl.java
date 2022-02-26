package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.AdministratorMapper;
import com.test.pojo.Administrator;
import com.test.utils.Md;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdministratorserviceImpl implements Administratorservice{
    @Autowired
  private AdministratorMapper administratorMapper;

    @Override
    public JSON login(String username,String password) {
        JSONObject json = new JSONObject();
        Administrator login = administratorMapper.login(username, Md.Encrypted_MD5(password));
        if (login!=null) {
            login.setPassword("");
            json.put("msg", "登录成功");
            json.put("data",login);
            json.put("code", 1);
        } else {
            json.put("msg", "登录失败，密码或者用户名错误");
            json.put("u_id", null);
            json.put("uesrname",null);
            json.put("jurisdiction", null);
            json.put("code", 0);
        }
        return json;
    }

    @Override
    public JSON insert(Administrator administrator){
            JSONObject json = new JSONObject();
            int code = 0;
            administrator.setPassword(Md.Encrypted_MD5("123456"));
            code = administratorMapper.insert(administrator);
            if (code == 1) {
                json.put("msg", "添加成功");
                json.put("code", 1);
            } else {
                json.put("msg", "添加失败");
                json.put("code", 0);
            }
            return json;
        }

    }


