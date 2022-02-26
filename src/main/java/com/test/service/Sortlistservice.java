package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Sortlist;

import java.util.List;


public interface Sortlistservice {

    //查询某分类的文章
    List<Sortlist> selectsortInfo(String sorthing, int page, int limit);

    //查询单篇文章
    Sortlist selectbyid(int sort_id);

    //添加分类库文章
    JSON addsortInfo(Sortlist sortlist);

    //查询所有类库文章
    List<Sortlist> queryAllSort(int page, int limit);

    //更新类库
    JSON updateSort(Sortlist sortlist);

    //删除类库文章
    JSON deleteSortById(int sort_id);
}
