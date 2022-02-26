package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Article;
import java.util.List;

public interface Articleservice {
    //添加作品
    JSON addArticleInfo(Article article);

    //删除作品
    JSON deleteArticleInfo( int article_id);

    //更改作品
    JSON updateArticle(Article article);

    //查看作品

    Article selectArticle(int article_id);

    //查看所有作品
    List<Article> selectArticleInfos(int page, int limit);
}
