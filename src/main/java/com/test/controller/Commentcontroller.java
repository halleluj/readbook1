package com.test.controller;


import com.alibaba.fastjson.JSON;
import com.test.pojo.Comment;
import com.test.pojo.Result;
import com.test.service.Commentservice;
import com.test.utils.MessageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Commentcontroller")
@ResponseBody
@CrossOrigin
public class Commentcontroller {
    @Autowired
    private Commentservice commentservice;


    // 查询单个
    @GetMapping("/queryById")
    public Result<Object> queryById (int commentId){
        return MessageUtil.success(commentservice.queryById(commentId));
    }

    //<!--查询指定行数据-->
    @GetMapping("/queryAllByLimit")
    public Result<Object> queryAllByLimit(@Param("page")int page, @Param("limit")int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(commentservice.queryAllByLimit(page2, limit));
    }

    //查询指定行
    @GetMapping("/queryAllByOne")
    public Result<Object> queryAllByOne(@Param("article_id")int article_id,int page,int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(commentservice.queryAllByOne(article_id,page2, limit));
    }

    //查询指定行
    @GetMapping("/queryAllByOne2")
    public Result<Object> queryAllByOne2(@Param("togetherId")int togetherId,int page,int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(commentservice.queryAllByOne2(togetherId,page2, limit));
    }

    //查询指定行
    @GetMapping("/queryAllByOne3")
    public Result<Object> queryAllByOne3(String UID,int page,int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(commentservice.queryAllByOne3(UID,page2, limit));
    }

    //新增评论
    @GetMapping("/insertNewComment")
    public Result<Object> insertNewComment(Comment comment){
        return MessageUtil.success(commentservice.insertNewComment(comment));
    }

    //修改
    @GetMapping("/updateComment")
    public Result<Object> updateComment(Comment comment){
        return MessageUtil.success(commentservice.updateComment(comment));
    }

    //删除
    @GetMapping("/deleteById")
    public Result<Object> deleteById(@Param("commentId")int commentId){
        return MessageUtil.success(commentservice.deleteById(commentId));
    }
}
