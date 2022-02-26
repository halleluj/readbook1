package com.test.mapper;


import com.test.pojo.Comment;
import com.test.pojo.Commentuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface CommentMapper {

// 查询单个

  Commentuser queryById (@Param("commentId")int commentId);

//<!--查询指定行数据-->
  List<Commentuser> queryAllByLimit(@Param("page")int page, @Param("limit")int limit);

  //查询指定行
  List<Commentuser> queryAllByOne(@Param("article_id")int article_id,int page,int limit);

  List<Commentuser> queryAllByOne2(@Param("togetherId")int togetherId,int page,int limit);

  List<Commentuser> queryAllByOne3(String UID,int page,int limit);

  //新增评论
    int insertNewComment(Comment comment);

    //修改
  int updateComment(Comment comment);

  //删除
  int deleteById(@Param("commentId")int commentId);

}
