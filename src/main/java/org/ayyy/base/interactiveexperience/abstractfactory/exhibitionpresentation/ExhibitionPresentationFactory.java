package org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation;

import org.ayyy.base.interactiveexperience.abstractfactory.InteractiveExperienceFactory;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.ScreenType;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.TouchScreen;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:09 PM
 * @Description:实际工厂，创建展览解说的工厂
 */
public class ExhibitionPresentationFactory extends InteractiveExperienceFactory {

    /** 不属于自己的创建方法，不实现
     * */
    @Override
    public TouchScreen createTouchScreen(ScreenType screenType, Double width, Double length, String content) {
        return null;
    }


    /**实现了抽象工厂的createExhibitionPresentation方法
     * */
    @Override
    public ExhibitionPresentation createExhibitionPresentation(ExhibitionPresentationType type, String name) {
        /**
         * 根据选择的类型，创建不同的解说
         * */
        if (type==ExhibitionPresentationType.ANTIQUE){
            return new AntiquePresentation(name,type);
        } else if (type==ExhibitionPresentationType.AREA) {
            return new AreaPresentation(name,type);
        }

        return null;
    }
}
