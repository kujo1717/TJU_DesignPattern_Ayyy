package org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:13 PM
 * @Description:对藏品的解说
 */
public class AntiquePresentation extends ExhibitionPresentation{
    public AntiquePresentation(String name, ExhibitionPresentationType type) {
        super(name,type);
    }


    /**开始对藏品的解说
     * */
    @Override
    public void presentation() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AntiquePresentation",
                        "presentation",
                        String.valueOf(System.identityHashCode(this)),
                        "对 "+this.getTargetName()+" [藏品]的解说开始"
                )
        );
    }
}
