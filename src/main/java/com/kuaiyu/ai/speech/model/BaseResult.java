package com.kuaiyu.ai.speech.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: kuaiyu-yyk
 * @Description:
 * @Date: 2020/10/13 上午 11:13
 * @Version:
 */
@ApiModel(value = "BaseResult", description = "全局返回值")
public class BaseResult {

    /**
     * 状态码：1成功，其他为失败
     */
    @ApiModelProperty("状态码，1：正常，其他异常")
    public int code = 1;

    /**
     * 成功为success，其他为失败原因
     */
    @ApiModelProperty("返回消息")
    public String message = null;

    @ApiModelProperty("返回当前操作是否正常完成，true:正常，false:异常")
    public boolean success = true;

    /**
     * 数据结果集
     */
    @ApiModelProperty(value = "返回的结果集", dataType = "Object")
    public Object data;

    /**
     * 返回结果
     *
     * @param message 消息
     * @param data    数据集
     */
    public BaseResult(Object data, String message) {
        this.message = message;
        this.data = data;
    }

    public BaseResult(String message, Object data, int code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public BaseResult() {

    }

    public BaseResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public BaseResult(Object data) {
        this.data = data;
    }

    public BaseResult(Object data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public BaseResult(Object data, int code, String message, boolean success) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public BaseResult(Object data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }


    public BaseResult(String message, boolean success, int code) {
        this.message = message;
        this.success = success;
        this.code = code;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
