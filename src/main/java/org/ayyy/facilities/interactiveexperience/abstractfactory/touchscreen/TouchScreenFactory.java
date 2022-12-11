package org.ayyy.facilities.interactiveexperience.abstractfactory.touchscreen;

import org.ayyy.facilities.interactiveexperience.abstractfactory.InteractiveExperienceFactory;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:15 PM
 * @Description:
 */
public class TouchScreenFactory extends InteractiveExperienceFactory {
    @Override
    public TouchScreen createTouchScreen(ScreenType screenType, Double width, Double length, String content) {

        if (screenType== screenType.HISTORYPROCESS){
            //历史脉络
            return new HistoryProcessScreen(width,length,content);
        } else if (screenType== screenType.MODEL3D) {
            //3D模型
            return new Model3DScreen(width,length,content);
        }

        return null;
    }
}

