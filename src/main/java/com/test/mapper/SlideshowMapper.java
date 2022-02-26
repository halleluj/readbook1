package com.test.mapper;

import com.test.pojo.Slideshow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SlideshowMapper {

    List<Slideshow> queryAllBypType (String pType, @Param("page") int page,@Param("limit") int limit);

    List<Slideshow> queryAllpicture(@Param("page") int page,@Param("limit") int limit);

    int insertnewpicture (Slideshow slideshow);

    int updatepicture (Slideshow slideshow);

    int deletepicture(@Param("photoId")int photoId);
}
