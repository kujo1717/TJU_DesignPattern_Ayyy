package org.ayyy.observer;

import org.ayyy.base.observer.ConcreteObserver;
import org.ayyy.base.observer.ConcreteTicketState;
import org.ayyy.base.observer.Observer;
import org.junit.jupiter.api.Test;

/**
 * 观察者模式的测试
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/10 9:49]
 */
public class ObserverTest {
    @Test
    void test(){
        ConcreteObserver concreteObserver=new ConcreteObserver();
        concreteObserver.update();
    }
}
