package com.example.demo.event.springevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
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

@Component("evtPublisher")
public class MethodExeuctionEventPublisher implements ApplicationEventPublisherAware {
    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     *
     * @param applicationEventPublisher springevent publisher to be used by this object
     */

    private ApplicationEventPublisher eventPublisher;


    public void methodToMonitor() {
        MethodExecutionEvent beginEvt = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.START);

        // publishEvent 执行时将会触发MethodExecutionEventListener.onApplicationEvent() 方法
        this.eventPublisher.publishEvent(beginEvt);

        // 执行时实际方法逻辑


        MethodExecutionEvent endEvt = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.END);
        this.eventPublisher.publishEvent(endEvt);
    }


    /**
     * 容器启动的时候会自动注入 applicationContext 作为 publisher
     * @param appCtx
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher appCtx) {
        this.eventPublisher = appCtx;
        }
}
