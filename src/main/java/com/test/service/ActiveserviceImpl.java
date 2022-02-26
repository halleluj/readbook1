package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.ActiveMapper;
import com.test.pojo.Active;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveserviceImpl implements Activeservice{
    @Autowired
     private ActiveMapper activeMapper;

    //   查询单个
    @Override
    public Active selectActiveInfo(int activeID){
        return activeMapper.selectActiveInfo(activeID);
    }

    //   查询全部活动
    @Override
    public List<Active> selectActiveInfos(int page, int limit){
       return activeMapper.selectActiveInfos(page, limit);
    }

    //    查询活动状态
    @Override
    public List<Active> selectpActivecode(int page, int limit, int activeCode){
        return activeMapper.selectpActivecode(page, limit, activeCode);
    }

    //    添加活动
    @Override
    public JSON addActiveInfo(Active active){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=activeMapper.addActiveInfo(active);
            if(code ==1){
                json.put("msg","添加新活动成功");
                json.put("code",1);
            }else{
                json.put("msg","添加新活动失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //    修改活动内容
    @Override
    public JSON updateActiveInfo(Active active){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= activeMapper.updateActiveInfo(active);
            if(code ==1){
                json.put("msg","更改成功");
                json.put("code",1);
            }else{
                json.put("msg","更改失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;

    }

    //    删除活动
    @Override
    public JSON deleteActiveInfo(int activeID){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= activeMapper.deleteActiveInfo(activeID);
            if(code ==1){
                json.put("msg","删除成功");
                json.put("code",1);
            }else{
                json.put("msg","删除失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;


    }
}
