package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Result;
import com.test.pojo.Slideshow;
import com.test.service.Slideshowservice;
import com.test.utils.MessageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Slideshowcontroller")
@Controller
@CrossOrigin
@ResponseBody
public class Slideshowcontroller {
    @Autowired
    private Slideshowservice slideshowservice;

    @GetMapping("/queryAllBypType")
    public Result<Object> queryAllBypType (String pType, @Param("page") int page, @Param("limit") int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(slideshowservice.queryAllBypType(pType, page2, limit));
    }

    @GetMapping("/queryAllpicture")
public   Result<Object>  queryAllpicture(@Param("page") int page,@Param("limit") int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(slideshowservice.queryAllpicture(page2, limit));
    }

    @GetMapping("/insertnewpicture")
   public Result<Object> insertnewpicture (Slideshow slideshow){
        return MessageUtil.success(slideshowservice.insertnewpicture(slideshow));
    }


    @GetMapping("/updatepicture")
    public Result<Object> updatepicture (Slideshow slideshow){
        return MessageUtil.success(slideshowservice.updatepicture(slideshow));
    }

    @GetMapping("/deletepicture")
   public Result<Object> deletepicture(@Param("photoId")int photoId){
        return MessageUtil.success(slideshowservice.deletepicture(photoId));
    }

}
