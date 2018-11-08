package com.example.demo.event.jdkevent;

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
public class JDKEventDemo {
    public static void main(String[] args) {
        JDKMethodExeuctionEventPublisher publisher = new JDKMethodExeuctionEventPublisher();

        JDKMethodExecutionEventListener listener = new JDKSimpleMethodExecutionEventListener();
        publisher.addListener(listener);
        publisher.methodToMonitor();
    }
}
