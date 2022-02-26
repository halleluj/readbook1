package com.test.controller;


import com.test.pojo.Apply;
import com.test.pojo.Result;
import com.test.service.Applyservice;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Applyconntroller")
@Controller
@ResponseBody
@CrossOrigin
public class Applyconntroller {
    @Autowired
    private Applyservice applyservice;
    private int UID;
    private int activeCode;

    @GetMapping("/insertNewApply")
    public Result<Object> insertNewApply(Apply apply){
        return MessageUtil.success(applyservice.insertNewApply(apply));
    }

    @GetMapping("/updateNewApply")
    public Result<Object> updateNewApply(Apply apply){
        return MessageUtil.success(applyservice.updateNewApply(apply));
    }

    @GetMapping("/deleteApply")
    public Result<Object> deleteApply (int ApplyID){
        return MessageUtil.success(applyservice.deleteApply(ApplyID));
    }


    @GetMapping("/selectinfomation")
  public   Result<Object> selectinfomation (int ApplyID){
    return MessageUtil.success(applyservice.selectinfomation(ApplyID));
    }

    @GetMapping("/selectinformations")
   public Result<Object> selectinformations (int page, int limit){
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(applyservice.selectinformations(page2, limit));
    }

    @GetMapping("/selectinformationsByok")
    public Result<Object> selectinformationsByok(String UID,int activeCode,int page,int limit){
        this.activeCode = activeCode;
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(applyservice.selectinformationsByok(UID, activeCode, page2, limit));
    }

}
