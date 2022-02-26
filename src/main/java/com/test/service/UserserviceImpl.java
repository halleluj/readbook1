package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.Usermapper;
import com.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice{
    @Autowired
    private Usermapper usermapper;

    @Override
    public JSON  addUserInfo(User user){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= usermapper.addUserInfo(user);
            if(code ==1){
                json.put("msg","添加新用户成功");
                json.put("code",1);
            }else{
                json.put("msg","添加新用户失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    @Override
    public  JSON deleteUserInfo(int id) {
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= usermapper.deleteUserInfo(id);
            if(code ==1){
                json.put("msg","删除用户成功");
                json.put("code",1);
            }else{
                json.put("msg","删除用户失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;

    }

    @Override
   public JSON updateUserInfo(User user){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= usermapper.updateUserInfo(user);
            if(code ==1){
                json.put("msg","更改用户信息成功");
                json.put("code",1);
            }else{
                json.put("msg","更改用户信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    @Override
    public JSON updateUserInfobyuid(User user){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= usermapper.updateUserInfobyuid(user);
            if(code ==1){
                json.put("msg","更改用户信息成功");
                json.put("code",1);
            }else{
                json.put("msg","更改用户信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }


    @Override
    public User selectUserInfo(int id) {
        return usermapper.selectUserInfo(id);
    }

    @Override
    public List<User> selectUserInfos(int page, int limit){
        return usermapper.selectUserInfos(page, limit);
    }

   @Override
   public List<User>  selectUID(String UID){return  usermapper.selectUID(UID);}
}
