package com.second.guara.entity;

public class Test {
    String string;
    private Test test;
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Test(String string) {
        this.string = string;
    }

    public Test(String string, Test test) {
        this.string = string;
        this.test = test;
    }
}
