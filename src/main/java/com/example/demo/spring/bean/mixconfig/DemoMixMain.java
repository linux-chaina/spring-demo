package com.example.demo.spring.bean.mixconfig;

import com.example.demo.domain.Dog;
import com.example.demo.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 三种方式混合配置
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/1/12 8:23 PM
 */
public class DemoMixMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig1.class);
        User user = (User) context.getBean("user");
        System.out.println(user);

        // javaconfig 中导入的xml中的bean
        User mixUser = (User) context.getBean("mixUser");
        System.out.println(mixUser);

        // xml中导入的javaconfig中的bean
        Dog xmlWillImport = (Dog) context.getBean("xmlWillImport");
        System.out.println(xmlWillImport);

    }
}
