package com.example.demo.spring.bean.auto;

import org.springframework.stereotype.Component;

/**
 * // 不带configuration注解的bean
 *
 * @author zhangjianwei
 * @date 2019/1/12
 */

@Component
public class NoConfigurationBean {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NoConfigurationBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
