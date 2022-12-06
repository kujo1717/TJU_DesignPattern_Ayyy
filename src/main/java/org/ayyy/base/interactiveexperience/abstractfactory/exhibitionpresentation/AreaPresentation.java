package org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:13 PM
 * @Description:对展馆的解说
 */
public class AreaPresentation extends ExhibitionPresentation{

    //constructor
    public AreaPresentation(String name, ExhibitionPresentationType type) {
        super(name,type);
    }


    /**开始对展区的解说
     * */
    public void presentation() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AntiquePresentation",
                        "presentation",
                        String.valueOf(System.identityHashCode(this)),
                        "对 "+this.getTargetName()+" [展馆]的解说开始"
                )
        );
    }
}
