package com.second.guara.entity.response;

public class RespondData {
    private int userid;
    private String nickname;
    private String token;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public RespondData(int userid, String nickname, String token) {
        this.userid = userid;
        this.nickname = nickname;
        this.token = token;
    }
}
