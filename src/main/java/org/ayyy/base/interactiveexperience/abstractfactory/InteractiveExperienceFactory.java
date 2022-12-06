package org.ayyy.base.interactiveexperience.abstractfactory;


import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentation;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentationType;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.ScreenType;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.TouchScreen;



/**
 * @Author: 杨严
 * @Date: 2022/12/06/2:22 PM
 * @Description: 互动体验项目，包含类型有 展览讲解、计算机互动设施、场景复原
 * 抽象工厂模式
 */
public abstract class InteractiveExperienceFactory {
    /**
     * 抽象工厂类，创造触摸屏的工厂
     * */
    public abstract TouchScreen createTouchScreen(ScreenType screenType,Double width,Double length,String content);

    /**
     * 抽象工厂类，创造展览解说的工厂
     * */
    public abstract ExhibitionPresentation createExhibitionPresentation(ExhibitionPresentationType type,String name);

}
