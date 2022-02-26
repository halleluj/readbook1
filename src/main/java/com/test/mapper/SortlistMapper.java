package com.test.mapper;

import com.test.pojo.Sortlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SortlistMapper {
    //查询某分类的文章
    List<Sortlist> selectsortInfo(String sorthing,@Param("page")int page,@Param("limit")int limit);

    //查询单篇文章
    Sortlist selectbyid(@Param("sort_id")int sort_id);

    //添加分类库文章
    int addsortInfo(Sortlist sortlist);

    //查询所有类库文章
    List<Sortlist> queryAllSort(@Param("page")int page,@Param("limit")int limit);

    //更新类库
    int updateSort(Sortlist sortlist);

    //删除类库文章
    int deleteSortById(@Param("sort_id")int sort_id);
}
