package org.ayyy.base.interactiveexperience.abstractfactory.touchscreen;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayyy.base.interactiveexperience.abstractfactory.InteractiveExperience;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:12 PM
 * @Description: 触摸屏，抽象基类
 */
@Data
@NoArgsConstructor
public abstract class TouchScreen extends InteractiveExperience {

    //屏幕宽
    private Double screenWidth;
    //屏幕长
    private Double screenLength;

    //屏幕内容介绍
    private String contentText;

    //内容的类型
    private ScreenType screenType;

    //静态ID标号
    private static Long countID=0l;

    /***
     * 全参数constructor
     * */
    public TouchScreen(Double width, Double length, String content, ScreenType type) {
        this.screenWidth=width;
        this.screenLength=length;
        this.contentText=content;
        this.screenType=type;
        this.id=countID++;
        this.name=content;
    }


    /**
     * 屏幕开始展示内容
     * */
    public abstract void displayScreen();


}


