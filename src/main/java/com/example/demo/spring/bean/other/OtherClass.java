package com.example.demo.spring.bean.other;

import org.springframework.stereotype.Component;

/**
 * @author zhangjianwei
 * @date 2019/1/12
 */
//@Configuration
@Component
public class OtherClass {

    private String ID;

    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OtherClass{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
