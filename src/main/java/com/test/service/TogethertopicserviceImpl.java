package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.TogethertopicMapper;
import com.test.pojo.Togethertopic;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TogethertopicserviceImpl implements Togethertopicservice{
    @Autowired
    private TogethertopicMapper togethertopicMapper;

    //查看指定类型的所有题目
    @Override
 public    List<Togethertopic> selectbytype(String togetherType, int page, int limit){
        return  togethertopicMapper.selectbytype(togetherType, page, limit);
    }


    //查看指定类型的一个题目
    @Override
  public   List <Togethertopic> selectbytypeone(String togetherType,int page,int limit){
        return togethertopicMapper.selectbytypeone(togetherType, page, limit);
    }

    //查看题目
    @Override
  public   Togethertopic queryById (int togetherId){
        return togethertopicMapper.queryById(togetherId);
    }

    //查看所有题目
    @Override
   public List <Togethertopic> queryAllByLimit(int page, int limit){
        return togethertopicMapper.queryAllByLimit(page, limit);
    }

    //增添新的题目 web端
    @Override
    public JSON insertTopic(Togethertopic togethertopic){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= togethertopicMapper.insertTopic(togethertopic);
            if(code ==1){
                json.put("msg","添加新作品成功");
                json.put("code",1);
            }else{
                json.put("msg","添加新作品失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //更新题目
    @Override
   public JSON updateTopic(Togethertopic togethertopic){
       JSONObject json=new JSONObject();
       try {
           int code=0;
           code= togethertopicMapper.updateTopic(togethertopic);
           if(code ==1){
               json.put("msg","更改新作品成功");
               json.put("code",1);
           }else{
               json.put("msg","更改新作品失败");
               json.put("code",0);
           }
       }catch (Exception e){
           e.printStackTrace();
           json.put("msg","数据接口异常，请稍后重试");
           json.put("code",-1);
       }
       return json;
   }

    //删除题目
    @Override
   public JSON deleteTopic(int togetherId){
       JSONObject json=new JSONObject();
       try {
           int code=0;
           code= togethertopicMapper.deleteTopic(togetherId);
           if(code ==1){
               json.put("msg","删除新作品成功");
               json.put("code",1);
           }else{
               json.put("msg","删除新作品失败");
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
