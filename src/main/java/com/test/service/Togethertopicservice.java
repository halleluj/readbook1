package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Togethertopic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Togethertopicservice {
    //查看指定类型的所有题目
    List<Togethertopic> selectbytype(String togetherType, int page, int limit);


    //查看指定类型的一个题目
    List <Togethertopic> selectbytypeone(String togetherType, int page, int limit);

    //查看题目
    Togethertopic queryById (int togetherId);

    //查看所有题目
    List <Togethertopic> queryAllByLimit(int page, int limit);

    //增添新的题目 web端
    JSON insertTopic(Togethertopic togethertopic);

    //更新题目
    JSON updateTopic(Togethertopic togethertopic);

    //删除题目
    JSON deleteTopic(int togetherId);

}
