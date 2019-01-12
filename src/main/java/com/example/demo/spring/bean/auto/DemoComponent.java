package com.example.demo.spring.bean.auto;

import org.springframework.stereotype.Component;

/**
 * Component 注解
 * 可以理解 @Configuration 是自动配置，@Bean是显式配置，属于javaConfig
 *
 * @author zhangjianwei
 * @date 2019/1/10
 */

@Component
public class DemoComponent {

    private String name = "DemoComponent_name";

    private String age = "12";

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
        return "DemoComponent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
