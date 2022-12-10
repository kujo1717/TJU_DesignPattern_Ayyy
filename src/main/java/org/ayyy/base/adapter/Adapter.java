package org.ayyy.base.adapter;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 适配器模式，改变电压值
 *
 * @author : [29447]
 * @version : [v1.0]
 * @createTime : [2022/12/9 23:59]
 */
public class Adapter {
    public void changPower(){
        InputPower inputPower=new InputPower();
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                "changePower",
                String.valueOf(System.identityHashCode(this)),
                "使用适配器进行适配"
        ));
        OutputPower outputPower=new OutputPower();
    }
}
