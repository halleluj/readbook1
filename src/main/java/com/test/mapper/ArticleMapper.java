package com.test.mapper;

import com.test.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

 @Mapper
 @Repository
public interface ArticleMapper {

    //添加作品
    int addArticleInfo(Article article);

    //删除作品
     int deleteArticleInfo(@Param("article_id") int article_id);

    //更改作品
    int updateArticle(Article article);

    //查看作品

    Article selectArticle(@Param("article_id")int article_id);

    //查看所有作品
    List<Article>selectArticleInfos(@Param("page")int page,@Param("limit")int limit);

}
