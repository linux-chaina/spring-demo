package com.example.demo.spring.bean.mixconfig;

import com.example.demo.domain.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Program Name: spring-demo
 * <p>
 * Description: JavaConfig3 配置类
 * 用于在xml中导入
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/1/12 8:24 PM
 */

@Configuration
public class JavaConfig3 {

    @Bean("xmlWillImport")
    public Dog getDog(){
        return new Dog("122", "12");
    }
}
