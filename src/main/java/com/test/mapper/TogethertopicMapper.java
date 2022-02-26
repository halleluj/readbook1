package com.test.mapper;

import com.test.pojo.Togethertopic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TogethertopicMapper {
    //查看指定类型的所有题目
   List <Togethertopic> selectbytype(String togetherType, @Param("page")int page, @Param("limit")int limit);


   //查看指定类型的一个题目
   List <Togethertopic> selectbytypeone(String togetherType, @Param("page")int page, @Param("limit")int limit);

   //查看题目
   Togethertopic queryById (@Param("togetherId")int togetherId);

   //查看所有题目
   List <Togethertopic> queryAllByLimit(@Param("page")int page, @Param("limit")int limit);

   //增添新的题目 web端
   int insertTopic(Togethertopic togethertopic);

   //更新题目
   int updateTopic(Togethertopic togethertopic);

   //删除题目
   int deleteTopic(@Param("togetherId")int togetherId);
}
