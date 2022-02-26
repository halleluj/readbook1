package com.test.controller;


import com.alibaba.fastjson.JSON;
import com.test.pojo.Result;
import com.test.pojo.Sortlist;
import com.test.service.Sortlistservice;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Sortlistcontroller")
public class Sortlistcontroller {
    @Autowired

    private Sortlistservice sortlistservice;

    //查询某分类的文章
    @GetMapping("/selectsortInfo")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectsortInfo(String sorthing, int page, int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(sortlistservice.selectsortInfo(sorthing,page2,limit));
    }

    //查询单篇文章
    @GetMapping("/selectbyid")
    @ResponseBody
    @CrossOrigin
  public   Result<Object> selectbyid(int sort_id){
        Sortlist sortlist = new Sortlist();
        sortlist.setSort_id(sort_id);
        return MessageUtil.success(sortlistservice.selectbyid(sort_id));
    }

    //添加分类库文章
    @GetMapping("/addsortInfo")
    @CrossOrigin
    @ResponseBody
    public Result<Object> addsortInfo(Sortlist sortlist){
        return MessageUtil.success(sortlistservice.addsortInfo(sortlist));
    }

    //查询所有类库文章
    @GetMapping("/queryAllSort")
    @ResponseBody
    @CrossOrigin
    public Result<Object> queryAllSort(int page, int limit){
        int page1 = page-1;
        int page2 = page1*limit;
     return  MessageUtil.success(sortlistservice.queryAllSort(page2,limit));
    }

    //更新类库
    @GetMapping("/updateSort")
    @ResponseBody
    @CrossOrigin
    public Result<Object> updateSort(Sortlist sortlist){
        return MessageUtil.success(sortlistservice.updateSort(sortlist));
    }

    //删除类库文章
    @GetMapping("/deleteSortById")
    @ResponseBody
    @CrossOrigin
    public Result<Object> deleteSortById(@RequestParam(required = false)int sort_id){
        return MessageUtil.success(sortlistservice.deleteSortById(sort_id));
    }

}
