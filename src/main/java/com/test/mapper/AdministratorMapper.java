package com.test.mapper;

import com.test.pojo.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdministratorMapper {
    Administrator login(String username,String password);

    int insert (Administrator administrator);
}
