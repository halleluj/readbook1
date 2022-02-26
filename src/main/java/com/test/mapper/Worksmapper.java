package com.test.mapper;

import com.test.pojo.Works;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface Worksmapper {

  //添加作品
  int addworkInfo(Works works);

  //删除作品
  int deleteworkInfo(@Param("w_id")int w_id);

  //更改作品
  int updateworkInfo(Works works);

  //查看个人作品
  Works selectworkInfo(@Param("UID") String UID);

  //查看做所有作品
  List<Works> selectworkInfos(@Param("page")int page, @Param("limit")int limit);

  //随机推送作品
    List<Works> selectwhereworkInfo(@Param("wCode")int wCode,@Param("page")int page, @Param("limit")int limit);

  //审核作品
   int checkworkinfo(@Param("wCode")int wCode,@Param("w_id")int w_id);

   List<Works> rightworks(@Param("page")int page,@Param("limit")int limit,@Param("wCode")int wCode);

    List<Works> rightworks2(String UID,@Param("page")int page,@Param("limit")int limit);

}
