package org.ayyy.base.interactiveexperience.abstractfactory.touchscreen;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:14 PM
 * @Description: 3D模型的屏幕
 */
public class Model3DScreen extends TouchScreen {


    /**
     * constructor
     * */
    public Model3DScreen(Double width, Double length, String content) {
        super(width,length,content,ScreenType.MODEL3D);
    }


    /**
     * 屏幕开始展示3D模型
     * */
    @Override
    public void displayScreen() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Model3DScreen",
                        "DisplayScreen",
                        String.valueOf(System.identityHashCode(this)),
                        "3D模型的屏幕开始展示可交互的3D模型，模型是"+this.getContentText()+
                                "\n\t 屏幕长宽为"+this.getScreenLength()+","+this.getScreenWidth()
                )
        );
    }
}
