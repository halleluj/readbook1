package com.test.controller;

import com.test.pojo.Article;
import com.test.pojo.Result;
import com.test.service.Articleservice;
import com.test.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Articlecontroller")
public class Articlecontroller {
    @Autowired
    private Articleservice articleservice;

    @GetMapping("/addArticleInfo")
    @ResponseBody
    @CrossOrigin
    public Result<Object> addArticleInfo(Article article){
        return MessageUtil.success(articleservice.addArticleInfo(article));
    }

    @GetMapping("/deleteArticleInfo")
    @ResponseBody
    @CrossOrigin
    public Result<Object> deleteArticleInfo( int article_id){
        return MessageUtil.success(articleservice.deleteArticleInfo(article_id));
    }
    @GetMapping("/updateArticle")
    @ResponseBody
    @CrossOrigin
    public Result<Object> updateArticle(Article article){
        return MessageUtil.success(articleservice.updateArticle(article));
    }

    @GetMapping("/selectArticle")
    @ResponseBody
    @CrossOrigin

  public Result<Object> selectArticle(int article_id){
        Article article = new Article();
        article.setArticle_id(article_id);
        return MessageUtil.success(articleservice.selectArticle(article_id));

    }

    @GetMapping("/selectArticleInfos")
    @ResponseBody
    @CrossOrigin
    public Result<Object> selectArticleInfos(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "10")int limit){
        System.out.println(page+" "+limit);
        int page1 = page-1;
        int page2 = page1*limit;
        return MessageUtil.success(articleservice.selectArticleInfos(page2,limit));
    }


}
