package com.createService.infrastructure.share.controllers;

public class ResponseBody {

    private String code;
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public void setData(String data) {
        this.data = data;
    }

    public ResponseBody(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseBody(String message, Object data) {
        this.message = message;
        this.data = data;
    }


}
