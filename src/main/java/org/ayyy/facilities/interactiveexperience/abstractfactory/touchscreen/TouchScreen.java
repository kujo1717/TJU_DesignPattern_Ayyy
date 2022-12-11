package org.ayyy.facilities.interactiveexperience.abstractfactory.touchscreen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayyy.facilities.interactiveexperience.abstractfactory.InteractiveExperience;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:12 PM
 * @Description:
 */
@Data
@NoArgsConstructor
public abstract class TouchScreen extends InteractiveExperience {
    private Double screenWidth;
    private Double screenLength;
    private String contentText;

    public TouchScreen(Double width, Double length, String content, ScreenType type) {
        this.screenWidth=width;
        this.screenLength=length;
        this.contentText=content;
        this.screenType=type;
    }

    public  ScreenType screenType;

    public abstract void displayScreen();


}


