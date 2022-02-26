package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Comment;
import com.test.pojo.Commentuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Commentservice {

    // 查询单个

    Commentuser queryById (@Param("commentId")int commentId);

    //<!--查询指定行数据-->
    List<Commentuser> queryAllByLimit(@Param("page")int page, @Param("limit")int limit);

    //查询指定行
    List<Commentuser> queryAllByOne(@Param("article_id")int article_id,int page,int limit) ;

    List<Commentuser> queryAllByOne2(int togetherId,int page,int limit) ;

    List<Commentuser> queryAllByOne3(String UID,int page,int limit) ;

    //新增评论
    JSON insertNewComment(Comment comment);

    //修改
    JSON updateComment(Comment comment);

    //删除
    JSON deleteById(@Param("commentId")int commentId);

}
