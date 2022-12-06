package org.ayyy.abstractfactory;

import org.ayyy.facilities.interactiveexperience.abstractfactory.InteractiveExperienceFactory;
import org.ayyy.facilities.interactiveexperience.abstractfactory.touchscreen.ScreenType;
import org.ayyy.facilities.interactiveexperience.abstractfactory.touchscreen.TouchScreen;
import org.ayyy.facilities.interactiveexperience.abstractfactory.touchscreen.TouchScreenFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:03 PM
 * @Description:
 */

public class AbstractFactoryTest {
    @Test
    void test(){
        InteractiveExperienceFactory TouchScreenFactory= new TouchScreenFactory();
        TouchScreen HistoryScreen=TouchScreenFactory.createTouchScreen(ScreenType.HISTORYPROCESS,200d,100d,"明朝历史");
        HistoryScreen.displayScreen();
        assertEquals(HistoryScreen.getScreenType(),ScreenType.HISTORYPROCESS);

        TouchScreen Model3DScreen=TouchScreenFactory.createTouchScreen(ScreenType.MODEL3D,200d,100d,"司母戊大方鼎");
        Model3DScreen.displayScreen();
        assertEquals(Model3DScreen.getScreenType(),ScreenType.MODEL3D);

    }
}
