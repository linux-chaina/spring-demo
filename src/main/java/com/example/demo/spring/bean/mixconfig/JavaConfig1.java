package com.example.demo.spring.bean.mixconfig;

import com.example.demo.domain.Dog;
import com.example.demo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Program Name: spring-demo
 * <p>
 * Description: javaConfig 1 配置类
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0，
 * @date 2019/1/12 8:24 PM
 */
@Configuration
// 导入另一个javaconfig配置类
@Import(JavaConfig2.class)
// 导入xml的配置
@ImportResource("classpath:MixXmlConfig.xml")
public class JavaConfig1 {

    @Bean("user")
    public User getUser(Dog dog) {
        return new User(dog);
    }
}
