package com.test.service;


import com.test.pojo.Syslog;

import java.util.List;

public interface LogService {
    //新增日志
    int addLog(Syslog syslog);
    //查看日志
    List<Syslog> selectLogInfo(int page, int limit);
}
