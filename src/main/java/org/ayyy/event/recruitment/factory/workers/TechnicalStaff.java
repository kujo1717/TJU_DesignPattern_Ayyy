package org.ayyy.event.recruitment.factory.workers;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:48
 * @Description: TODO
 * @Version: 1.0
 **/
public class TechnicalStaff implements Worker {

    /**
     * Default constructor
     */
    public TechnicalStaff() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "TechnicalStaff",
                        "TechnicalStaff",
                        String.valueOf(System.identityHashCode(this)),
                        "招到一个技术人员"
                )
        );
    }

    public void work() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "TechnicalStaff",
                        "work",
                        String.valueOf(System.identityHashCode(this)),
                        "技术人员做馆内的技术工作"
                )
        );

    }

}
