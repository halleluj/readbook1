package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Active;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Activeservice {
    //   查询单个
    Active selectActiveInfo (int activeID);

    //   查询全部活动
    List<Active> selectActiveInfos(int page,int limit);

    //    查询活动状态
    List<Active> selectpActivecode(int page,int limit,int activeCode);

    //    添加活动
    JSON addActiveInfo(Active active);

    //    修改活动内容
    JSON updateActiveInfo(Active active);

    //    删除活动
    JSON deleteActiveInfo(int activeID);

}
