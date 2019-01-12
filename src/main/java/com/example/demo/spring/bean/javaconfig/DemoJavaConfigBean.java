package com.example.demo.spring.bean.javaconfig;

import com.example.demo.domain.Dog;
import com.example.demo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * javaconfig
 * 添加此注解表示该类是配置类，ComponentScan会扫描类下定义的bean
 * Bean注解的使用
 *
 * @author zhangjianwei
 * @date 2019/1/12
 */

@Configuration
public class DemoJavaConfigBean {
    /**
     *     @Bean("user") // 别名
     *     @Bean(name = "user") // 别名
     *     @Bean(value = "user")  // id 名
     *     @Bean  // 默认取方法名
     */
    @Bean("user")
    public User demoUserBean() {
        return new User("jack","12",new Dog());
    }

    @Bean
    public Dog demoDog(){
        return new Dog();
    }

    /**
     * 引入装配bean，方法1 ：引用创建bean的方法，demoDog()
     * @return
     */
    @Bean
    public User demoUserMethodInjection(){
        return new User(demoDog());
    }

    /**
     * 构造方法注入方式，
     * 在创建user这个bean的时候，只要被依赖的的bean ç，spring会将其注入。
     * dog bean 只要存在即可，创建的方式没有限制，可以是三种bean创建方式中任何一种创建的
     *
     * @param dog
     * @return
     */
    @Bean
    public User demoUserConstructorInjection(Dog dog) {

        return new User(dog);
        // 这里是构造注入。setter注入也是可行的
        // 如
//        User user = new User();
//        user.setDog(dog);
//        return user;
    }
}
