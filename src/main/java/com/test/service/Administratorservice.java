package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Administrator;

public interface Administratorservice {

    JSON login (String username, String password);

    JSON insert (Administrator administrator);
}
