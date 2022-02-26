package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.SortlistMapper;
import com.test.pojo.Sortlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortlistserviceImpl implements Sortlistservice{
    @Autowired
    private SortlistMapper sortlistMapper;

    //查询某分类的文章
    @Override
    public List<Sortlist> selectsortInfo(String sorthing, int page, int limit){
        return sortlistMapper.selectsortInfo(sorthing,page,limit);
    }

    //查询单篇文章
    @Override
    public Sortlist selectbyid(int sort_id){

        return sortlistMapper.selectbyid(sort_id);
    }

    //添加分类库文章
    @Override
    public JSON addsortInfo(Sortlist sortlist){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=  sortlistMapper.addsortInfo(sortlist);
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

    //查询所有类库文章
    @Override
    public List<Sortlist> queryAllSort(int page, int limit){
        return sortlistMapper.queryAllSort(page,limit);
    }

    //更新类库
    @Override
    public JSON updateSort(Sortlist sortlist){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=  sortlistMapper.updateSort(sortlist);
            if(code ==1){
                json.put("msg","更改作品成功");
                json.put("code",1);
            }else{
                json.put("msg","更改作品失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //删除类库文章
    @Override
    public JSON deleteSortById(int sort_id){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=  sortlistMapper.deleteSortById(sort_id);
            if(code ==1){
                json.put("msg","删除作品成功");
                json.put("code",1);
            }else{
                json.put("msg","删除作品失败");
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
