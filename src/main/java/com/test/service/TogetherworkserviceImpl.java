package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.TogetherworkMapper;
import com.test.pojo.Togetherwork;
import com.test.pojo.Tworklinkuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TogetherworkserviceImpl implements Togetherworkservice{
    @Autowired
      private TogetherworkMapper togetherworkMapper;

    //查询单条一起写
    @Override
    public Tworklinkuser queryById(int ID){return togetherworkMapper.queryById(ID);}

    //查询所有一切写
    @Override
    public List<Tworklinkuser> queryAllByLimit(int page, int limit){return togetherworkMapper.queryAllByLimit(page, limit);}

    //查询某一一起写的所有内容
    @Override
    public List<Tworklinkuser> queryAllbyTID(int togetherId, int page, int limit,int tCode){return togetherworkMapper.queryAllbyTID(togetherId, page, limit,tCode);}

    //查询某用户的一起写内容
    @Override
    public List<Tworklinkuser> queryAllbyUID(String UID, int page, int limit){
        return togetherworkMapper.queryAllbyUID(UID, page, limit);
    }

    //用户编写一起写
    @Override
    public JSON writeByID(Togetherwork togetherwork){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= togetherworkMapper.writeByID(togetherwork);
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

    //web更改内容
    @Override
    public JSON updatetogether(Togetherwork togetherwork){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= togetherworkMapper.updatetogether(togetherwork);
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

    //删除此条编写
    @Override
    public JSON deleteById(int ID){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= togetherworkMapper.deleteById(ID);
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

    //审核作品
    @Override
    public JSON checkthis(int ID,int tCode){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= togetherworkMapper.checkthis(ID,tCode);
            if(code ==1){
                json.put("msg","审核作品成功");
                json.put("code",1);
            }else{
                json.put("msg","审核作品失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //查看指定作品状态
    @Override
    public List<Tworklinkuser> selectright(int page,int limit,int tCode){
        return togetherworkMapper.selectright(page, limit, tCode);
    }
}
