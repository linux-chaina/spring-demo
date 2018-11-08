package com.example.demo.event.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * Program Name: spring-demo
 * <p>
 * Description: Event
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class MethodExecutionEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1347655006246525568L;

    private String methodName;
    private String methodExecutionStatus;

    public MethodExecutionEvent(Object source) {
        super(source);
    }

    public MethodExecutionEvent(Object source,String methodName, String methodExecutionStatus) {
        super(source);
        this.methodExecutionStatus = methodExecutionStatus;
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodExecutionStatus() {
        return methodExecutionStatus;
    }

    public void setMethodExecutionStatus(String methodExecutionStatus) {
        this.methodExecutionStatus = methodExecutionStatus;
    }
}
