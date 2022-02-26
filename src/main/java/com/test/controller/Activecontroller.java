package com.test.controller;

import com.test.pojo.Active;
import com.test.pojo.Result;
import com.test.service.Activeservice;
import com.test.service.Administratorservice;
import com.test.utils.MessageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Activecontroller")
@CrossOrigin
@ResponseBody
@Controller
public class Activecontroller {
    @Autowired
    private Activeservice activeservice;



        //   查询单个
  @GetMapping("/selectActiveInfo")
 public Result<Object> selectActiveInfo (int activeID){
      return MessageUtil.success(activeservice.selectActiveInfo(activeID));
  }

    //   查询全部活动
    @GetMapping("/selectActiveInfos")
   public Result<Object> selectActiveInfos( int page, int limit){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(activeservice.selectActiveInfos(page2,limit));
    }

    //    查询活动状态
    @GetMapping("/selectpActivecode")
    public Result<Object> selectpActivecode(int page,int limit,int activeCode){
        int page1=page-1;
        int page2=page1*limit;
        return MessageUtil.success(activeservice.selectpActivecode(page2, limit, activeCode));
    }

    //    添加活动
    @GetMapping("/addActiveInfo")
    public Result<Object> addActiveInfo(Active active){
      return MessageUtil.success(activeservice.addActiveInfo(active));
    }

    //    修改活动内容
    @GetMapping("/updateActiveInfo")
    public Result<Object> updateActiveInfo(Active active){
      return MessageUtil.success(activeservice.updateActiveInfo(active));
    }

    //    删除活动
    @GetMapping("/deleteActiveInfo")
    public Result<Object> deleteActiveInfo(int activeID){
     return MessageUtil.success(activeservice.deleteActiveInfo(activeID));
    }

}
