package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.ArticleMapper;
import com.test.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleserviceImpl implements Articleservice{
    @Autowired
    private ArticleMapper articleMapper;

    //添加作品
    @Override
    public JSON addArticleInfo(Article article){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= articleMapper.addArticleInfo(article);
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

    //删除作品
    @Override
    public JSON deleteArticleInfo(int article_id){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= articleMapper.deleteArticleInfo(article_id);
            if(code ==1){
                json.put("msg","删除作品成功");
                json.put("code",1);
            }else{
                json.put("msg","删除作品失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //更改作品
    @Override
    public JSON updateArticle(Article article){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= articleMapper.updateArticle(article);
            if(code ==1){
                json.put("msg","更新作品成功");
                json.put("code",1);
            }else{
                json.put("msg","更新作品失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //查看作品
    @Override
    public Article selectArticle(int article_id){
        return articleMapper.selectArticle(article_id);
        }

    //查看所有作品
    @Override
    public List<Article> selectArticleInfos(int page, int limit){
        return articleMapper.selectArticleInfos(page,limit);
    }

}
