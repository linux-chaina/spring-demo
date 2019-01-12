package com.example.demo.spring.bean.xml;

import com.example.demo.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangjianwei
 * @date 2019/1/12
 */
public class DemoXmlMain {
    public static void main(String[] args) {
        // DemoXmlConfig.xml 要放到classPath下
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoXmlConfig.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);

    }
}
