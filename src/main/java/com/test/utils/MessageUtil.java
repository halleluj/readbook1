package com.test.utils;

import com.test.pojo.Result;

public class MessageUtil {
    public static Result<Object> success(Object object){
        Result<Object> r = new Result<>();
        r.setCode(1);
        r.setMessage("success");
        if(object!=null){
            r.setData(object);
        }
        return r;
    }

    public static Result<Object> error(Object object){
        Result<Object> r = new Result<>();
        r.setCode(0);
        r.setMessage("fail");
        if(object!=null){
            r.setData(object);
        }
        return r;
    }
}
