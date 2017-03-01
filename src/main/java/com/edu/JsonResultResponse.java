package com.edu;

import java.io.Serializable;

/**
 * Created by wuxiaolong on 2017/2/27.
 */
public class JsonResultResponse<T> implements Serializable{
    public static final Integer SUCCESS = 0;
    public static final Integer FAIL = 1;

    private Integer status;
    private T data;
    private String message;

    public JsonResultResponse() {
    }

    public JsonResultResponse(T data) {
        this.status = SUCCESS;
        this.data = data;
        this.message = "success";
    }
    public JsonResultResponse(Throwable e) {
        this.status = FAIL;
        this.data = null;
        this.message = e.getMessage();
    }
    public JsonResultResponse(Integer status, Throwable e) {
        this.status = status;
        this.data = null;
        this.message = e.getMessage();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "JsonResultResponse{" +
                "status=" + status +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
