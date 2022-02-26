package com.test.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.test.pojo.Result;
import com.test.pojo.Works;
import com.test.service.Worksservice;
import com.test.service.WorksserviceImpl;
import com.test.utils.MessageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/Workscontroller")
public  class Workscontroller {
    @Autowired
  private Worksservice worksservice;

    @GetMapping("/addworkInfo")
    @ResponseBody
    @CrossOrigin

    public JSON addworkInfo(Works works){return worksservice.addworkInfo(works);}


    @GetMapping("/deleteworkInfo")
    @ResponseBody
    @CrossOrigin

    public JSON deleteworkInfo(int w_id){return worksservice.deleteworkInfo(w_id);}

    @GetMapping("/updateworkInfo")
    @ResponseBody
    @CrossOrigin
    public JSON updateworkInfo(Works works){return worksservice.updateworkInfo(works);}

    @GetMapping("/selectworkInfo")
    @ResponseBody
    @CrossOrigin
    public Works selectworkInfo( String UID){
        Works works = new Works();
        works.setUID(UID);
        return worksservice.selectworkInfo(UID);
    }

    @GetMapping("/selectworkInfos")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectworkInfos(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        System.out.println(page+" "+limit);
//        JSONObject json = new JSONObject();

//        Random random = new Random();
        int page1 = page-1;
        int page2 = page1*limit;
//        List<Works> works = worksservice.selectworkInfos(page2, limit);
//        int ra = random.nextInt(works.size());
//        System.out.println(works.size());
//        System.out.println(works.get(ra));
        return MessageUtil.success(worksservice.selectworkInfos(page2, limit));
//        json.put("code",0);
//        json.put("msg","");
//        json.put("count",worksservice.selectworkInfos(0, 100000).size());
//        json.put("data",worksservice.selectworkInfos(page2, limit));
//        return json;


    }

    @GetMapping("/selectwhereworkInfo")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectwhereworkInfo( int wCode, int page, int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        Random random = new Random();
        List<Works> works = worksservice.selectwhereworkInfo(wCode,page2, limit);
        int ra = random.nextInt(works.size());
        System.out.println(works.get(ra));
        return MessageUtil.success(works.get(ra));
//        Works works = new Works();
//        Random random = new Random();
//        w_id=random.nextInt(15);
//        works.setW_id(w_id);
//        return worksservice.selectwhereworkInfo(w_id);
//    return MessageUtil.success(worksservice.selectwhereworkInfo(w_id));
    }

    @GetMapping("/checkworkinfo")
    @ResponseBody
    @CrossOrigin
    public Result<Object> checkworkinfo(int wCode,int w_id){
        return MessageUtil.success(worksservice.checkworkinfo(wCode,w_id));

    }

    @GetMapping("/rightworks")
    @ResponseBody
    @CrossOrigin
    public  Result<Object> rightworks(int page,int limit,@RequestParam(required = false) int wCode ){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(worksservice.rightworks(page2,limit,wCode));
    }

    @GetMapping("/rightworks2")
    @ResponseBody
    @CrossOrigin
    public Result<Object> rightworks2(String UID, @Param("page") int page, @Param("limit") int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(worksservice.rightworks2( UID, page2, limit));
    }


}
