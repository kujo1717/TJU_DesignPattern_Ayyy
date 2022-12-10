package org.ayyy.base.observer;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 具体的观察者，当
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/10 9:43]
 */
public class ConcreteObserver implements Observer{
    /**
     * Default constructor
     */
    public ConcreteObserver() {
    }

    public void leave(){
        CallStackLogger.log(new CallStackLogInfo(
                "ConcreteObserver",
                "leave",
                String.valueOf(System.identityHashCode(this)),
                "参观者离开博物馆"
        ));
    }
    /**
     * @return
     */
    public void update() {
        ConcreteTicketState ticketState=new ConcreteTicketState();
        ticketState.setCurrent_state("已使用");
        leave();
        CallStackLogger.log(new CallStackLogInfo(
                "ConcreteObserver",
                "update",
                String.valueOf(System.identityHashCode(this)),
                "当前的门票信息为已使用"
        ));
    }
}
