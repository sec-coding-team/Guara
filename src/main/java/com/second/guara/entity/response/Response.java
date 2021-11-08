package com.second.guara.entity.response;

public class Response {
    private boolean flag;
    private int code;
    private String message;
    private RespondData data;
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response(boolean flag, int code, String message, RespondData data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
