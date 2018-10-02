package com.jay.commons.constant;


import lombok.Getter;

@Getter
public enum Status {

    E("有效"),
    I("无效");
    private String desc;

    Status(String desc) {
        this.desc = desc;
    }
}
