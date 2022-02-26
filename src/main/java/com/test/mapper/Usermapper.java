package com.test.mapper;


import com.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Usermapper {

    int addUserInfo(User user);

    int deleteUserInfo(@Param("id")int id);

    int updateUserInfo(User user);

    int updateUserInfobyuid(User user);

    User selectUserInfo(@Param("id")int id);

    User selectwhereUserInfo(@Param("id")int id);

    List<User> selectUserInfos(@Param("page")int page, @Param("limit")int limit);

    List<User> selectUID(@Param("UID") String UID);


}
