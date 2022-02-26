package com.test.mapper;


import com.test.pojo.Active;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository

public interface ActiveMapper {

//   查询单个
   Active selectActiveInfo (@Param("activeID")int activeID);

//   查询全部活动
    List<Active> selectActiveInfos(@Param("page")int page,@Param("limit")int limit);

//    查询活动状态
    List<Active> selectpActivecode(@Param("page")int page,@Param("limit")int limit,@Param("activeCode")int activeCode);

//    添加活动
    int addActiveInfo(Active active);

//    修改活动内容
    int updateActiveInfo(Active active);

//    删除活动
    int deleteActiveInfo(@Param("activeID")int activeID);
}
