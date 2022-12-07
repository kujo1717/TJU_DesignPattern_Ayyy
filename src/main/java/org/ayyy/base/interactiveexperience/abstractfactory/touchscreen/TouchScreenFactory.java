package org.ayyy.base.interactiveexperience.abstractfactory.touchscreen;

import org.ayyy.base.interactiveexperience.abstractfactory.InteractiveExperienceFactory;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentation;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentationType;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:15 PM
 * @Description: 实际工厂，创建触摸屏的工厂，
 */
public class TouchScreenFactory extends InteractiveExperienceFactory {


    @Override
    /**实现了抽象工厂的createTouchScreen方法
     * */
    public TouchScreen createTouchScreen(ScreenType screenType, Double width, Double length, String content) {

        /**根据输入的类型，创建对应的触摸屏
         * */
        if (screenType== screenType.HISTORYPROCESS){
            //历史脉络
            return new HistoryProcessScreen(width,length,content);
        } else if (screenType== screenType.MODEL3D) {
            //3D模型
            return new Model3DScreen(width,length,content);
        }
        return null;
    }


    /** 不属于自己的创建方法，不实现
     * */
    @Override
    public ExhibitionPresentation createExhibitionPresentation(ExhibitionPresentationType type, String name) {
        return null;
    }
}

