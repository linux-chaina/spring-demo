package com.example.demo.event.jdkevent;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 自定义的监听器接口的实现
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class JDKSimpleMethodExecutionEventListener implements JDKMethodExecutionEventListener {

    /**
     * 处理方法开始执行的时候发布的MethodExecutionEvent事件
     *
     * @param jdkMethodExecutionEvent
     */
    @Override
    public void onMethodBegin(JDKMethodExecutionEvent jdkMethodExecutionEvent) {
        String methodName = jdkMethodExecutionEvent.getMethodName();
        System.out.println("开始执行方法：" + methodName);
    }

    /**
     * 处理方法执行将结束时候发布的MethodExecutionEvent事件
     *
     * @param jdkMethodExecutionEvent
     */
    @Override
    public void onMethodEnd(JDKMethodExecutionEvent jdkMethodExecutionEvent) {
        String methodName = jdkMethodExecutionEvent.getMethodName();
        System.out.println("结束执行方法：" + methodName);
    }
}
