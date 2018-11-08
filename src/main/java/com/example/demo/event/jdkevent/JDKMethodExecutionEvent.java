package com.example.demo.event.jdkevent;

import java.util.EventObject;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 事件
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class JDKMethodExecutionEvent extends EventObject {

    private static final long serialVersionUID = 6420716193660425103L;
    private String methodName;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public JDKMethodExecutionEvent(Object source) {
        super(source);
    }

    public JDKMethodExecutionEvent(Object source, String methodName) {
        super(source);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
