package com.ghb.enums;

/**
 * Created by ASUS on 2017/5/4.
 */
public enum ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"还在上小学"),
    MIDDLE_SCHOOL(200,"还在上初中");
    private Integer code;
    private String message;


    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
