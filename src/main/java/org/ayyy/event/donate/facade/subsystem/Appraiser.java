package org.ayyy.event.donate.facade.subsystem;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 15:56
 * @Description: TODO
 * @Version: 1.0
 **/
public class Appraiser {
    /**
     * Default constructor
     */
    public Appraiser() {
    }

    /**
     * @return
     */
    public void appraise() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Appraiser",
                        "appraise",
                        String.valueOf(System.identityHashCode(this)),
                        "让评估员完成文物评估工作"
                )
        );
    }
}
