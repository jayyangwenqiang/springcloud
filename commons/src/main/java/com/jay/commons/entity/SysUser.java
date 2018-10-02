package com.jay.commons.entity;

import com.jay.commons.constant.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SysUser {

    private Integer id;
    private String name;
    private String password;
    private String phone;
    private Status status;
    private Date createTime;
    private Date updateTime;
}
