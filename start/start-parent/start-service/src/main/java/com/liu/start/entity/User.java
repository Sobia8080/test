package com.liu.start.entity;

import java.io.Serializable;

/**
 * Created by liufangrui on 2018/10/24.
 */
public class User implements Serializable{

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
