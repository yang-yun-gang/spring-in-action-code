package com.yangyungang.springaction.chapter03;

import java.io.Serializable;

/**
 * @Description : api请求体
 * @Author : young
 * @Date : 2023-08-10 22:56
 * @Version : 1.0
 **/
public class ApiRequestBody implements Serializable {

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
