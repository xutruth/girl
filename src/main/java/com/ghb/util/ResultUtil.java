package com.ghb.util;

import com.ghb.entity.Result;

/**
 * Created by ASUS on 2017/5/4.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMeg("成功");
        result.setData(object);
        return result;
    }
    public static  Result error(Integer code,String msg){

        Result result = new Result();
        result.setCode(code);
        result.setMeg(msg);
        result.setData(null);
        return result;
    }
}
