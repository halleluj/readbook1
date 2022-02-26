package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.User;


import java.util.List;

public interface Userservice {
    JSON addUserInfo(User user);
    JSON deleteUserInfo(int id);
    JSON updateUserInfo(User user);
    JSON updateUserInfobyuid(User user);
    User selectUserInfo(int id);
    List<User> selectUserInfos(int page, int limit);
   List<User>  selectUID(String UID);

}
