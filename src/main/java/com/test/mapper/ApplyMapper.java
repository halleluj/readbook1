package com.test.mapper;

import com.test.pojo.Applicationform;
import com.test.pojo.Apply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplyMapper {

  int  insertNewApply(Apply apply);

  int updateNewApply(Apply apply);

  int deleteApply (@Param("ApplyID")int ApplyID);

  Applicationform selectinfomation (@Param("ApplyID")int ApplyID);

  List<Applicationform>selectinformations (@Param("page")int page,@Param("limit")int limit);

  List<Applicationform> selectinformationsByok(@Param("UID")String UID,@Param("activeCode") int activeCode,@Param("page")int page,@Param("limit")int limit );
}
