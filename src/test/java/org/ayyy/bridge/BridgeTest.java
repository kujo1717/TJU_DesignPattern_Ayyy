package org.ayyy.bridge;

import org.ayyy.base.interactiveexperience.abstractfactory.InteractiveExperienceFactory;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentation;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentationFactory;
import org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation.ExhibitionPresentationType;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.ScreenType;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.TouchScreen;
import org.ayyy.base.interactiveexperience.abstractfactory.touchscreen.TouchScreenFactory;
import org.ayyy.base.showcase.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class BridgeTest {
    @Test
    void test(){
        System.out.println("桥接模式测试开始...");
        // 选择金属材质
        ShowcaseTexture showcaseTexture = new MetalTexture();
        // 选择独立式的类型
        showcaseTexture.setShowcaseType(new SeparateShowcaseType());
        // 构建金属材质独立式展柜
        showcaseTexture.construct();

        // 选择玻璃材质
        ShowcaseTexture showcaseTexture1 = new GlassTexture();
        // 选择悬挂式的类型
        showcaseTexture1.setShowcaseType(new SuspendedShowcaseType());
        // 构建玻璃材质悬挂式展柜
        showcaseTexture1.construct();

    }
}
