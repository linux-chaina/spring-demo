package com.example.demo.spring.bean.auto;

import com.example.demo.spring.bean.other.OtherClass;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 隐式的bean发现机制与自动装配demo
 *
 * @author zhangjianwei
 * @date 2019/1/12
 */
public class DemoAutoMain {
    public static void main(String[] args) {

        // 通过基于注解的配置类获取上下文
        // DemoConfigAuto 配置类里加了两个注解，1配置，2扫描范围。容器将收纳管理相关配置中的所有bean
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfigAuto.class);

        // 获取bean：容器启动完成后即可从容器中获取bean进行使用
        try {
            DemoComponent demoComponent = (DemoComponent) applicationContext.getBean("demoComponent");
            System.out.println("demoComponent >>>>>>");
            System.out.println(demoComponent);
        } catch (BeansException e) {
            e.printStackTrace();
            System.err.println("demoComponent 获取失败 ===========");
        }


        // 使用componentScan 扫描包，spring会去创建bean，不需要configuration注解
        NoConfigurationBean noConfigurationBean = (NoConfigurationBean) applicationContext.getBean("noConfigurationBean");
        System.out.println("noConfigurationBean >>>>>>");
        System.out.println(noConfigurationBean);


        // 不在包扫描下的类，获取bean失败
        try {
            OtherClass otherClass = (OtherClass) applicationContext.getBean("otherClass");
            System.out.println("otherClass >>>>>>");
            System.out.println(otherClass);
        } catch (BeansException e) {
            System.err.println("otherClass 获取失败 ===========");
        }

    }
}
