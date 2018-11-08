package com.example.demo.event.springevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Program Name: spring-demo
 * <p>
 * Description:
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */

@Component("methodExecListener")
public class MethodExecutionEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        if (applicationEvent instanceof MethodExecutionEvent) {

            System.out.println("methodExecListener 执行 onApplicationEvent----->MethodExecutionEvent");

            // 执行逻辑
        }
    }
}
