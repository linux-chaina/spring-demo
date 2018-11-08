package com.example.demo.event.jdkevent;

import java.util.EventListener;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 自定义事件监听器接口 继承自JDK
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public interface JDKMethodExecutionEventListener extends EventListener {

    /**
     * 处理方法开始执行的时候发布的MethodExecutionEvent事件
     * @param jdkMethodExecutionEvent
     */
    void onMethodBegin(JDKMethodExecutionEvent jdkMethodExecutionEvent);

    /**
     *  处理方法执行将结束时候发布的MethodExecutionEvent事件
     * @param jdkMethodExecutionEvent
     */
    void onMethodEnd(JDKMethodExecutionEvent jdkMethodExecutionEvent);

}
