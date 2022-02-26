package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Result;
import com.test.pojo.Togethertopic;
import com.test.pojo.Works;
import com.test.service.Togethertopicservice;
import com.test.utils.MessageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/Togethertopiccontroller")
public class Togethertopiccontroller {
    @Autowired
    private Togethertopicservice togethertopicservice;


    //查看指定类型的所有题目
    @GetMapping("/selectbytype")
    @ResponseBody
    @CrossOrigin
   public Result<Object> selectbytype(String togetherType, int page,int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(togethertopicservice.selectbytype(togetherType, page2, limit));
    }


    //查看指定类型的一个题目
    @GetMapping("/selectbytypeone")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectbytypeone(String togetherType, int page, int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        Random random = new Random();
        List<Togethertopic> togethertopics = togethertopicservice.selectbytypeone(togetherType, page2, limit);
        int ra = random.nextInt(togethertopics.size());
        System.out.println(togethertopics.get(ra));
        return MessageUtil.success(togethertopics.get(ra));
    }

    //查看题目
    @GetMapping("/queryById")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryById (int togetherId){
        return  MessageUtil.success(togethertopicservice.queryById(togetherId));
    }

    //查看所有题目
    @GetMapping("/queryAllByLimit")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryAllByLimit(int page, int limit) {
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(togethertopicservice.queryAllByLimit(page2,limit));

    }

    //增添新的题目 web端
    @GetMapping("/insertTopic")
    @ResponseBody
    @CrossOrigin
    public Result<Object> insertTopic(Togethertopic togethertopic){
             return MessageUtil.success(togethertopicservice.insertTopic(togethertopic));
    }

    //更新题目
    @GetMapping("/updateTopic")
    @CrossOrigin
    @ResponseBody
    public Result<Object> updateTopic(Togethertopic togethertopic){
        return MessageUtil.success(togethertopicservice.updateTopic(togethertopic));
    }

    //删除题目
    @GetMapping("/deleteTopic")
    @ResponseBody
    @CrossOrigin
    public JSON deleteTopic(int togetherId){
        return togethertopicservice.deleteTopic(togetherId);
    }
}
