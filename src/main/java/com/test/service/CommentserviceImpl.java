package com.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.mapper.CommentMapper;
import com.test.pojo.Comment;
import com.test.pojo.Commentuser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentserviceImpl implements Commentservice{
    @Autowired
    private CommentMapper commentMapper;


        // 查询单个
    @Override
    public Commentuser queryById(@Param("commentId") int commentId){
        return commentMapper.queryById(commentId);
    }

    //<!--查询指定行数据-->
    @Override
    public List<Commentuser> queryAllByLimit(@Param("page") int page, @Param("limit") int limit){
        return commentMapper.queryAllByLimit(page, limit);
    }

    //查询指定行
    @Override
    public List<Commentuser> queryAllByOne(@Param("article_id") int article_id,int page, int limit) {
        return commentMapper.queryAllByOne(article_id,page, limit);
    }

    //查询指定行
    @Override
    public List<Commentuser> queryAllByOne2(int togetherId,int page, int limit) {
        return commentMapper.queryAllByOne2(togetherId,page, limit);
    }

    //查询指定行
    @Override
    public List<Commentuser> queryAllByOne3(String UID,int page, int limit) {
        return commentMapper.queryAllByOne3(UID,page, limit);
    }

    //新增评论
    @Override
    public JSON insertNewComment(Comment comment){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= commentMapper.insertNewComment(comment);
            if(code ==1){
                json.put("msg","新增评论成功");
                json.put("code",1);
            }else{
                json.put("msg","新增评论失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    //修改
    @Override
    public JSON updateComment(Comment comment){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= commentMapper.updateComment(comment);
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

    //删除
    public JSON deleteById(@Param("commentId") int commentId){
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code= commentMapper.deleteById(commentId);
            if(code ==1){
                json.put("msg","删除成功");
                json.put("code",1);
            }else{
                json.put("msg","删除失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

}
