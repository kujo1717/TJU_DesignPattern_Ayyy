package org.ayyy.base.adapter;

import lombok.Data;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 输出的电压
 *
 * @author : [29447]
 * @version : [v1.0]
 * @createTime : [2022/12/10 0:00]
 */
@Data
public class OutputPower {
    protected String current_power;
    public OutputPower(){
        current_power="5v";
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                getClass().getName(),
                String.valueOf(System.identityHashCode(this)),
                "经过适配后的电压为"+current_power
        ));
    }
}
