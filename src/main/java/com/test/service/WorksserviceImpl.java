package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.Worksmapper;
import com.test.pojo.Works;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksserviceImpl implements Worksservice{
    @Autowired
    private Worksmapper worksmapper;

    @Override
    public JSON addworkInfo(Works works){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= worksmapper.addworkInfo(works);
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


    @Override
   public JSON deleteworkInfo(int w_id){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= worksmapper.deleteworkInfo(w_id);
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


    @Override
    public JSON updateworkInfo(Works works){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= worksmapper.updateworkInfo(works);
            if(code ==1){
                json.put("msg","修改作品成功");
                json.put("code",1);
            }else{
                json.put("msg","修改作品失败");
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
    public Works selectworkInfo(String UID){
       return worksmapper.selectworkInfo(UID);
   }
   @Override
    public List<Works> selectworkInfos(int page, int limit){
       return worksmapper.selectworkInfos(page, limit);
   }
   @Override
    public List<Works> selectwhereworkInfo(int wCode,int page, int limit){
        return worksmapper.selectwhereworkInfo(wCode,page, limit);
   }

   @Override
    public JSON checkworkinfo(int wCode,int w_id){
        JSONObject json= new JSONObject();
        try{
            int code=0;
            code= worksmapper.checkworkinfo(wCode,w_id);
            if(code ==1){
                json.put("msg","审核成功");
                json.put("code",1);
            }else{
                json.put("msg","审核失败");
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
    public List<Works> rightworks(int page,int limit,int wCode){
        return worksmapper.rightworks(page,limit,wCode);

        }

        @Override
        public List<Works> rightworks2( String UID, @Param("page") int page, @Param("limit") int limit){
        return worksmapper.rightworks2( UID, page, limit);
        }


}


