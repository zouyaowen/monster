package com.zou.monster.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zou.monster.enums.ErrorEnum;
import com.zou.monster.exception.BusinessException;
import lombok.Data;

/**
 * 统一返回值处理
 *
 * @author zou
 * @date 2020-01-13 11:52 下午
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {

    private static final Integer SUCCESS = 200;
    private static final String SUCCESS_MESSAGE = "成功";
    private static final String FAIL_MESSAGE = "失败";

    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResponse success() {
        return new CommonResponse(SUCCESS, SUCCESS_MESSAGE);
    }

    public static <T> CommonResponse success(T data) {
        return new CommonResponse(SUCCESS, SUCCESS_MESSAGE, data);
    }

    public static CommonResponse error(Integer code, String message) {
        return new CommonResponse(code, message);
    }

    public static CommonResponse error(ErrorEnum errorEnum) {
        return new CommonResponse(errorEnum.getCode(), errorEnum.getMessage());
    }

    public static CommonResponse error(BusinessException businessException) {
        return new CommonResponse(businessException.getErrorCode(), businessException.getErrorMessage());
    }


}
