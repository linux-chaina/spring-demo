package com.example.demo.event.jdkevent;

import com.example.demo.event.springevent.MethodExecutionStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: spring-demo
 * <p>
 * Description: 事件发布者,本身作为事件源，会在合适地点，将相应事件发送给事件监听器
 * <p>
 * Created by zhangjianwei on 2018/10/29 0029
 *
 * @author zhangjianwei
 * @version 1.0
 */
public class JDKMethodExeuctionEventPublisher {
    private List<JDKMethodExecutionEventListener> listeners = new ArrayList<>();

    public void methodToMonitor() {
        JDKMethodExecutionEvent event2Publish =
                new JDKMethodExecutionEvent(this, "methodToMonitor");
        publishEvent(MethodExecutionStatus.START, event2Publish);

        publishEvent(MethodExecutionStatus.END, event2Publish);
    }

    /**
     * 发布事件
     *
     * @param eventStatus
     * @param jdkMethodExecutionEvent
     */
    protected void publishEvent(String eventStatus, JDKMethodExecutionEvent jdkMethodExecutionEvent) {
        ArrayList<JDKMethodExecutionEventListener> copyListeners = new ArrayList<>(listeners);

        for (JDKMethodExecutionEventListener listener : copyListeners) {
            if (JDKMethodExecutionStatus.START.equals(eventStatus)) {
                listener.onMethodBegin(jdkMethodExecutionEvent);
            } else {
                listener.onMethodBegin(jdkMethodExecutionEvent);
            }
        }
    }

    /**
     * 添加监听器
     * @param listener
     */
    public void addListener(JDKMethodExecutionEventListener listener) {
        this.listeners.add(listener);
    }

    /**
     * 移除监听器
     * @param listener
     */
    public void removeListener(JDKMethodExecutionEventListener listener) {
        this.listeners.remove(listener);
    }
}


