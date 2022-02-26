package com.test.mapper;

import com.test.pojo.Togetherwork;
import com.test.pojo.Tworklinkuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TogetherworkMapper {

    //查询单条一起写
    Tworklinkuser queryById (@Param("ID")int ID);

   //查询所有一切写
    List<Tworklinkuser> queryAllByLimit(@Param("page")int page, @Param("limit")int limit);

    //查询某一一起写的所有内容
    List<Tworklinkuser> queryAllbyTID(
    @Param("togetherId")int togetherId,@Param("page")int page,@Param("limit")int limit,@Param("tCode")int tCode);

    //查询某用户的一起写内容
    List<Tworklinkuser> queryAllbyUID(@Param("UID")String UID,@Param("page")int page,@Param("limit")int limit);

    //用户编写一起写
    int writeByID (Togetherwork togetherwork);

    //web更改内容
    int updatetogether(Togetherwork togetherwork);

    //删除此条编写
    int deleteById(@Param("ID")int ID);

    //审核此条编写
    int checkthis(@Param("ID")int ID,@Param("tCode")int tCode);

    //查看作品状态
   List<Tworklinkuser> selectright(@Param("page")int page,@Param("limit")int limit,@Param("tCode")int tCode);
}
