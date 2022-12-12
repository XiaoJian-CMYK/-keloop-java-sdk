package com.github.xjc.exception;

/**
 * 自定义配置异常类
 */
public class ConfigException extends RuntimeException {

    public ConfigException() {
        super();
    }

    public ConfigException(String message) {
        super(message);
    }

}
