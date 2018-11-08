package com.example.demo.event.springevent;

/**
 * Program Name: spring-demo
 * <p>
 * Description: Demo
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class EventDemo {
    public static void main(String[] args) {


        // 使用eventPulisher 已经注入到容器里，使用时直接获取eventPulisher Bean 执行publishEvent 方法，参数是某个event


        // 对相应event事件的处理，放在相应listner里 onApplication 方法，一般判断event的类型，再进行相应处理。
    }
}
