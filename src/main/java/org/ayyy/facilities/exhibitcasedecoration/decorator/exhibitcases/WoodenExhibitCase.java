package org.ayyy.facilities.exhibitcasedecoration.decorator.exhibitcases;

import org.ayyy.facilities.exhibitcasedecoration.decorator.ExhibitCase;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/7 20:47
 * @Description: TODO
 * @Version: 1.0
 **/
public class WoodenExhibitCase extends ExhibitCase {
    /**
     * Default constructor
     */
    public WoodenExhibitCase() {
    }

    /**
     * @return
     */
    public void display() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WoodenExhibitCase",
                        "display",
                        String.valueOf(System.identityHashCode(this)),
                        "新建了一个木制展柜"
                )
        );
    }

}
