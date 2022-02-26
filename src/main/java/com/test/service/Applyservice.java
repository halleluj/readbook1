package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Applicationform;
import com.test.pojo.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Applyservice {
    JSON insertNewApply(Apply apply);

    JSON updateNewApply(Apply apply);

    JSON deleteApply (int ApplyID);

    Applicationform selectinfomation (int ApplyID);

    List<Applicationform> selectinformations (int page, int limit);

    List<Applicationform> selectinformationsByok(String UID, int activeCode,int page,int limit);

}
