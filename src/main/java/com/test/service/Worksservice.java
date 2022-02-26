package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Works;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Worksservice {
    JSON addworkInfo(Works works);
    JSON deleteworkInfo(int w_id);
    JSON updateworkInfo(Works works);
    Works selectworkInfo(String UID);
    List<Works> selectworkInfos(int page, int limit);
   List<Works> selectwhereworkInfo(int wCode,int page, int limit);
   JSON checkworkinfo(int wCode,int w_id);
   List<Works> rightworks(int page,int limit,int wCode);
   List<Works> rightworks2( String UID, @Param("page")int page, @Param("limit")int limit);


}
