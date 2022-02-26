package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Slideshow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Slideshowservice {
    List<Slideshow> queryAllBypType (String pType, @Param("page") int page, @Param("limit") int limit);

    List<Slideshow> queryAllpicture(@Param("page") int page,@Param("limit") int limit);

    JSON insertnewpicture (Slideshow slideshow);

    JSON updatepicture (Slideshow slideshow);

    JSON deletepicture(@Param("photoId")int photoId);

}
