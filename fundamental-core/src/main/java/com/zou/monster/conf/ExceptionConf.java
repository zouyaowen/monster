package com.zou.monster.conf;

import com.zou.monster.enums.ErrorEnum;
import com.zou.monster.exception.BusinessException;
import com.zou.monster.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zou
 * @date 2020-01-15 10:42 下午
 */
@RestControllerAdvice
@Slf4j
public class ExceptionConf {
    /**
     * @param e 异常对象
     * @return CommonResponse<?> 统一返回值
     * @Desc 系统异常处理
     * @Author zyw
     * @Date 2019年6月19日下午7:29:25
     */
    @ExceptionHandler(RuntimeException.class)
    public CommonResponse<?> handleRuntimeException(RuntimeException e) {
        log.error("异常信息", e);
        //TODO 尝试打印所有的入参信息
        return CommonResponse.error(ErrorEnum.UNKNOW_ERROR);
    }

    @ExceptionHandler(BusinessException.class)
    public CommonResponse<?> handleBusinessException(BusinessException e) {
        //业务异常不打日志
        return CommonResponse.error(e);
    }


}
