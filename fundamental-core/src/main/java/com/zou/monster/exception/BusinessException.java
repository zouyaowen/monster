package com.zou.monster.exception;

import com.zou.monster.enums.ErrorEnum;
import com.zou.monster.error.CommonError;

/**
 * @author zou
 * @date 2020-01-13 11:23 下午
 */
public class BusinessException extends RuntimeException implements CommonError {

    private ErrorEnum errorEnum;


    @Override
    public Integer getErrorCode() {
        return null;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public String getErrorMessageEn() {
        return null;
    }

    @Override
    public CommonError setErrorMessage(String errorMessage) {
        return null;
    }
}
