package com.github.xjc.exception;

/**
 * 自定义响应异常类
 */
public class RespException extends RuntimeException {

    public RespException() {
        super();
    }

    public RespException(String message) {
        super(message);
    }

}
