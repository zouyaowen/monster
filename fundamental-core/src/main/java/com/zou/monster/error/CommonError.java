package com.zou.monster.error;


/**
 * 基础错误枚举类
 *
 * @author zou
 * @date 2020-01-13 10:55 下午
 */
public interface CommonError {
    /**
     * 获取错误码信息
     *
     * @return 错误码
     */
    Integer getErrorCode();

    /**
     * 获取错误信息
     *
     * @return 错误信息
     */
    String getErrorMessage();

    /**
     * 获取英文错误信息，多语言环境处理
     *
     * @return 英文错误信息
     */
    String getErrorMessageEn();

    /**
     * 设置错误信息
     *
     * @param errorMessage 错误信息
     * @return 错误对象
     */
    CommonError setErrorMessage(String errorMessage);
}
