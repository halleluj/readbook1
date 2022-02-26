package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.SlideshowMapper;
import com.test.pojo.Slideshow;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SlideshowserviceImpl implements Slideshowservice{
@Autowired

    private SlideshowMapper slideshowMapper;


    @Override
    public List<Slideshow> queryAllBypType(String pType, @Param("page") int page, @Param("limit") int limit){
        return slideshowMapper.queryAllBypType(pType, page, limit);
    }

    @Override
    public List<Slideshow> queryAllpicture(@Param("page") int page, @Param("limit") int limit){
        return slideshowMapper.queryAllpicture(page, limit);
    }

    @Override
    public JSON insertnewpicture(Slideshow slideshow){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= slideshowMapper.insertnewpicture(slideshow);
            if(code ==1){
                json.put("msg","添加新照片成功");
                json.put("code",1);
            }else{
                json.put("msg","添加新照片失败");
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
public JSON updatepicture(Slideshow slideshow)
    {JSONObject json=new JSONObject();
        try {
            int code=0;
            code= slideshowMapper.updatepicture(slideshow);
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
        return json;}

    public JSON deletepicture(@Param("photoId") int photoId){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= slideshowMapper.deletepicture(photoId);
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

}
