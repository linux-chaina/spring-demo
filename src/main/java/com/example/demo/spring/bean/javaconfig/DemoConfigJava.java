package com.example.demo.spring.bean.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * javaConfig 配置类
 * ComponentScan 扫描指定包
 *
 * @author zhangjianwei
 * @date 2019/1/10
 */

// 添加此注解表示该类是配置类，ComponentScan会扫描类下定义的bean
@Configuration
// ComponentScan根据源码，如果不指定扫描位置，则默认扫描位置是该类所在包
@ComponentScan

// 扫描指定包
// @ComponentScan("com.example.demo.spring.config")
// @ComponentScan(basePackages = {"com.example.demo.event","com.example.demo.spring.config"})

// 指定一个class，扫描位置为class所在的包
//@ComponentScan(basePackageClasses = DemoConfigAuto.class)
public class DemoConfigJava {
}
