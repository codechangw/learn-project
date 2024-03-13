package com.example.redisdemo.response;

import lombok.Data;

/**
 * @Classname BaseResponse
 * @Description TODO
 * @Date 2023/10/27 17:13
 * @Author ChangWang
 */
@Data
public class BaseResponse<T> {
    private String code;
    private String message;
    private T data;

    /**
     *
     * 默认构造方法
     *
     * @param code
     *            状态码
     * @param message
     *            接口信息
     * @param data
     *            接口数据
     */
    public BaseResponse(String code, String message, T data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认构造方法
     */
    public BaseResponse() {
        super();
    }
}
