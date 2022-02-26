package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Result;
import com.test.pojo.Togetherwork;
import com.test.service.Togetherworkservice;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Togetherworkcontroller")
@Controller
public class Togetherworkcontroller {
  @Autowired
    private Togetherworkservice togetherworkservice;

    //查询单条一起写
    @GetMapping("/queryById")
    @ResponseBody
    @CrossOrigin
   public Result<Object> queryById (int ID){
        return MessageUtil.success(togetherworkservice.queryById(ID));
    }

    //查询所有一切写
    @GetMapping("/queryAllByLimit")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryAllByLimit(int page, int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(togetherworkservice.queryAllByLimit(page2,limit));
    }

    //查询某一一起写的所有内容
    @GetMapping("/queryAllbyTID")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryAllbyTID(int togetherId,int page,int limit,int tCode){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(togetherworkservice.queryAllbyTID(togetherId, page2, limit,tCode));
    }

    //查询某用户的一起写内容
    @GetMapping("/queryAllbyUID")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryAllbyUID(String UID,int page,int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(togetherworkservice.queryAllbyUID(UID, page2, limit));
    }

    //用户编写一起写
    @GetMapping("/writeByID")
    @CrossOrigin
    @ResponseBody
    public Result<Object> writeByID (Togetherwork togetherwork){
        return MessageUtil.success(togetherworkservice.writeByID(togetherwork));
    }

    //web更改内容
    @GetMapping("/updatetogether")
    @ResponseBody
    @CrossOrigin
   public Result<Object> updatetogether(Togetherwork togetherwork){
        return  MessageUtil.success(togetherworkservice.updatetogether(togetherwork));
    }

    //删除此条编写
    @GetMapping("/deleteById")
    @CrossOrigin
    @ResponseBody
    public Result<Object> deleteById(@RequestParam(required = false) int ID){
        return MessageUtil.success(togetherworkservice.deleteById(ID));
    }


    //审核编写
    @GetMapping("/checkthis")
    @ResponseBody
    @CrossOrigin
    public Result<Object> checkthis(@RequestParam(required = false) int ID, int tCode){
        return MessageUtil.success(togetherworkservice.checkthis(ID, tCode));}


        //查看作品状态
    @GetMapping("/selectright")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectright(int page,int limit,int tCode){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(togetherworkservice.selectright(page2, limit, tCode));
    }

}
