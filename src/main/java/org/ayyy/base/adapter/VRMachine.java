package org.ayyy.base.adapter;

/**
 * VR设备，游客使用VR设备时触发
 *
 * @author : [29447]
 * @version : [v1.0]
 * @createTime : [2022/12/10 0:02]
 */
public class VRMachine {
    public void useVR(){
        Adapter adapter=new Adapter();
        adapter.changPower();
    }
}
