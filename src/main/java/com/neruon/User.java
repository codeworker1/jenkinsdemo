package com.neruon;

/**
 * @author zxy on 2023-06-06 15:27
 */
public class User {

    private String name;

    private Integer age;

    public User() {};

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

}
