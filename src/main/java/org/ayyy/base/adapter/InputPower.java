package org.ayyy.base.adapter;

import lombok.Data;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 输入的电压
 *
 * @author : [29447]
 * @version : [v1.0]
 * @createTime : [2022/12/10 0:00]
 */
@Data
public class InputPower {
    protected String current_power;
    public InputPower(){
        current_power="220v";
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                getClass().getName(),
                String.valueOf(System.identityHashCode(this)),
                "当前电压为"+current_power
        ));
    }
}
