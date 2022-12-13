package io.github.oneincase.core;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.List;

/**
 * 快跑者统一相应类
 */
@Data
public class KeloopRes {

    /**
     * 状态码，取值有 200，204；200 表示接口调用成功， 204 表示接口调用失败
     */
    private Integer code;

    /**
     * 错误信息，当接口调用失败（状态码为 204）时，返回的错误提示信息
     */
    private String message;

    /**
     * 返回数据，接口调用成功（状态码为 200）时返回的数据
     */
    private String data;

    /**
     * 请求签名
     */
    private String sign;

    /**
     * 返回数据解析为目标对象
     *
     * @param tclass 目标class
     * @param <T>    目标对象
     * @return 返回数据解析为目标对象
     */
    public <T> T parseObj(Class<T> tclass) {
        return JSONUtil.toBean(this.data, tclass);
    }

    /**
     * 返回数据解析为目标集合对象
     *
     * @param tclass 目标class
     * @param <T>    目标对象
     * @return 返回数据解析为目标对象
     */
    public <T> List<T> parseArray(Class<T> tclass) {
        return JSONUtil.toList(this.data, tclass);
    }

}
