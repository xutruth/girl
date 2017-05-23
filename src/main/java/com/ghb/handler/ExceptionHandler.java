package com.ghb.handler;

import com.ghb.Exception.GirlException;
import com.ghb.entity.Result;
import com.ghb.enums.ResultEnum;
import com.ghb.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义异常处理类
 * Created by ASUS on 2017/5/4.
 */

@ControllerAdvice
public class ExceptionHandler {
    private final  static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Result handle( Exception e){
        if (e instanceof GirlException){
            GirlException girlException = (GirlException) e;
           return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error("系统异常{}",e);
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(),ResultEnum.UNKNOWN_ERROR.getMessage());

        }
    }
}
