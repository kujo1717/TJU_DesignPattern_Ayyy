package org.ayyy.base.adapter;

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
        inputPower.setCurrent_power("220v");
        OutputPower outputPower=new OutputPower();
        System.out.println("当前电压为"+inputPower.getCurrent_power());
        outputPower.setCurrent_power("10v");
        System.out.println("经过适配后的电压为"+outputPower.getCurrent_power());
    }
}
