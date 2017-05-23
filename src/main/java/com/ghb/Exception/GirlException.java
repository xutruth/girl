package com.ghb.Exception;

import com.ghb.enums.ResultEnum;

/**
 * Created by ASUS on 2017/5/4.
 *
 * 自定义异常  需要额外抛出code信息
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
