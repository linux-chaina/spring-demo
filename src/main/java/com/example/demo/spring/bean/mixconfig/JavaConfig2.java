package com.example.demo.spring.bean.mixconfig;

import com.example.demo.domain.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Program Name: spring-demo
 * <p>
 * Description: JavaConfig2 配置类
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/1/12 8:24 PM
 */

@Configuration
public class JavaConfig2 {

    @Bean("dog")
    public Dog getDog(){
        return new Dog("122", "12");
    }
}
