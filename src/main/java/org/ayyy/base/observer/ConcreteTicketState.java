package org.ayyy.base.observer;

import lombok.Data;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 具体的门票，改变门票状态
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/10 9:42]
 */
@Data
public class ConcreteTicketState {
    /**
     * Default constructor
     */
    public ConcreteTicketState() {
        current_state="使用中";
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                "ConcreteTicketState",
                String.valueOf(System.identityHashCode(this)),
                "当前的门票信息为使用中"
        ));
    }

    /**
     *
     */
    public String current_state;
}
