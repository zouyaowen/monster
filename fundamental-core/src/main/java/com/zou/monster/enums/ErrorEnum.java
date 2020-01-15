package com.zou.monster.enums;

import com.zou.monster.error.CommonError;

/**
 * 基础错误枚举类
 *
 * @author zou
 * @date 2020-01-13 10:55 下午
 */
public enum ErrorEnum implements CommonError {
    // 没有错误code为200

    // 参数错误code统一返回-1
    REQUEST_PERAM_INVALIDED(-1, "请求参数不正确"),

    // 标准的HTTP请求错误码
    USER_REQUEST_UNAUTHORIZED(401, "用户请求未授权"),

    REQUEST_URL_NOT_EXIST(404, "请求路由不存在"),

    REQUEST_METHOD_NOT_ALLOWED(405, "请求方法错误"),

    // 500的为未知错误
    UNKNOW_ERROR(500, "系统内部错误"),

    RECORD_NOT_EXIST(400001, "记录不存在"),

    RECORD_ALREADY_EXIST(400002, "记录已经存在"),

    ;
    private Integer code;

    private String message;

    private String messageEn;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    ErrorEnum(Integer code, String message, String messageEn) {
        this.code = code;
        this.message = message;
        this.messageEn = messageEn;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageEn() {
        return messageEn;
    }

    @Override
    public Integer getErrorCode() {
        return this.code;
    }

    @Override
    public String getErrorMessage() {
        return this.messageEn;
    }

    @Override
    public String getErrorMessageEn() {
        return this.messageEn;
    }

    @Override
    public CommonError setErrorMessage(String errorMessage) {
        this.message = errorMessage;
        return this;
    }
}
