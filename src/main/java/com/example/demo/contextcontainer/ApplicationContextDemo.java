package com.example.demo.contextcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 上下文/容器的使用
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class ApplicationContextDemo {
    public static void main(String[] args) {
        String[] configLocations = new String[]{"/a/ss.xml","/a/aa2.xml"};
        ApplicationContext container = new FileSystemXmlApplicationContext(configLocations);

        //ApplicationContext container = new ClassPathXmlApplicationContext(configLocations);

        // 可以使用通配符
        //ApplicationContext container = new FileSystemXmlApplicationContext("conf/**/*.springxml");

        // 通过ApplicationContextDemo.class 所在的路径拼接传入的路径，定位配置文件的位置
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[] {"services.xml", "daos.xml"}, ApplicationContextDemo.class);

    }

}
