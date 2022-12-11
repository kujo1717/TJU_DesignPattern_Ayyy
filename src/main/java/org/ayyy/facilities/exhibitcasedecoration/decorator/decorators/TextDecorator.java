package org.ayyy.facilities.exhibitcasedecoration.decorator.decorators;

import org.ayyy.facilities.exhibitcasedecoration.decorator.Decorator;
import org.ayyy.facilities.exhibitcasedecoration.decorator.ExhibitCase;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/7 20:44
 * @Description: TODO
 * @Version: 1.0
 **/
public class TextDecorator extends Decorator {

    /**
     * @param exhibitcase
     */
    public TextDecorator(ExhibitCase exhibitcase) {
        // TODO implement here
        super(exhibitcase);
    }

    /**
     * @return
     */
    public void display() {
        super.display();
        setText();
    }

    /**
     * @return
     */
    public void setText() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LampsDecorator",
                        "setText",
                        String.valueOf(System.identityHashCode(this)),
                        "给展柜加上了对展品的文字介绍"
                )
        );
    }
}
