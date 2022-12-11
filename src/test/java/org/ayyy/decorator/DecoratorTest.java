package org.ayyy.decorator;

import org.ayyy.facilities.exhibitcasedecoration.decorator.ExhibitCase;
import org.ayyy.facilities.exhibitcasedecoration.decorator.decorators.LampsDecorator;
import org.ayyy.facilities.exhibitcasedecoration.decorator.decorators.TextDecorator;
import org.ayyy.facilities.exhibitcasedecoration.decorator.decorators.VideoPlayerDecorator;
import org.ayyy.facilities.exhibitcasedecoration.decorator.exhibitcases.WoodenExhibitCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @Author: 龙卓涵
 * @Date: 2022/12/7 21:17
 * @Description: TODO
 * @Version: 1.0
 **/
public class DecoratorTest {
    @Test
    void test(){
        ExhibitCase exhibitCase = new WoodenExhibitCase();
        ExhibitCase exhibitCaseL = new LampsDecorator(exhibitCase);
        ExhibitCase exhibitCaseLT = new TextDecorator(exhibitCaseL);
        ExhibitCase exhibitCaseLTV = new VideoPlayerDecorator(exhibitCaseLT);
        exhibitCaseLTV.display();
    }
}
