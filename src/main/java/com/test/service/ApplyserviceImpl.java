package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.ApplyMapper;
import com.test.pojo.Applicationform;
import com.test.pojo.Apply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyserviceImpl implements Applyservice {
@Autowired
    private ApplyMapper applyMapper;



    @Override
    public JSON insertNewApply(Apply apply){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=applyMapper.insertNewApply(apply);
            if(code ==1){
                json.put("msg","报名成功");
                json.put("code",1);
            }else{
                json.put("msg","报名失败");
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
    public JSON updateNewApply(Apply apply){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=applyMapper.updateNewApply(apply);
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

    @Override
    public JSON deleteApply(int ApplyID){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=applyMapper.deleteApply(ApplyID);
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

    @Override
    public Applicationform selectinfomation(int ApplyID){
        return applyMapper.selectinfomation(ApplyID);
    }

    @Override
    public List<Applicationform> selectinformations(int page, int limit){
        return applyMapper.selectinformations(page, limit);
    }

    @Override
    public List<Applicationform> selectinformationsByok(String UID, int activeCode, int page, int limit){
        return applyMapper.selectinformationsByok(UID, activeCode, page,limit);
    }

}
