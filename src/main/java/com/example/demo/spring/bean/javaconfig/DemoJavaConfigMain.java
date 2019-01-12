package com.example.demo.spring.bean.javaconfig;

import com.example.demo.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * javaConfig使用，通过Bean来创建的bean，写在带有configuration注解的类里面。
 * spring 需要扫描到带有configuration注解的类才会管理这些bean，所有需要让spring加载配置类。
 * 使用componentScan扫描到这些类即可。
 *
 * @author zhangjianwei
 * @date 2019/1/12
 */
public class DemoJavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfigJava.class);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
