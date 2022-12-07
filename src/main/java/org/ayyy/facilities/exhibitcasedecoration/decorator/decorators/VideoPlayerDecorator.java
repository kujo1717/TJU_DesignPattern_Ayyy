package org.ayyy.facilities.exhibitcasedecoration.decorator.decorators;

import org.ayyy.facilities.exhibitcasedecoration.decorator.Decorator;
import org.ayyy.facilities.exhibitcasedecoration.decorator.ExhibitCase;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/7 20:45
 * @Description: TODO
 * @Version: 1.0
 **/
public class VideoPlayerDecorator extends Decorator {

    /**
     * @param exhibitcase
     */
    public VideoPlayerDecorator(ExhibitCase exhibitcase) {
        // TODO implement here
        super(exhibitcase);
    }

    /**
     * @return
     */
    public void display() {
        super.display();
        setVideoPlayer();
    }

    /**
     * @return
     */
    public void setVideoPlayer() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LampsDecorator",
                        "setText",
                        String.valueOf(System.identityHashCode(this)),
                        "给展柜加上了视频播放器"
                )
        );
    }
}
