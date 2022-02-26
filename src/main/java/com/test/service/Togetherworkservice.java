package com.test.service;


import com.alibaba.fastjson.JSON;
import com.test.pojo.Togetherwork;
import com.test.pojo.Tworklinkuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Togetherworkservice {
    //查询单条一起写
    Tworklinkuser queryById (int ID);

    //查询所有一切写
    List<Tworklinkuser> queryAllByLimit(int page, int limit);

    //查询某一一起写的所有内容
    List<Tworklinkuser> queryAllbyTID(int togetherId,int page,int limit,int tCode);

    //查询某用户的一起写内容
    List<Tworklinkuser> queryAllbyUID(String UID,int page,int limit);

    //用户编写一起写
    JSON writeByID (Togetherwork togetherwork);

    //web更改内容
    JSON updatetogether(Togetherwork togetherwork);

    //删除此条编写
    JSON deleteById(int ID);

    //审查用户
    JSON checkthis(int ID,int tCode);

    //查看作品状态
    List<Tworklinkuser> selectright(int page,int limit,int tCode);

}
