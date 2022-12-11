package org.ayyy.event.recruitment.factory.workers;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:47
 * @Description: TODO
 * @Version: 1.0
 **/
public class ServiceStaff implements Worker {

    /**
     * Default constructor
     */
    public ServiceStaff() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ServiceStaff",
                        "ServiceStaff",
                        String.valueOf(System.identityHashCode(this)),
                        "招到了一个服务人员"
                )
        );
    }

    public void work() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ServiceStaff",
                        "work",
                        String.valueOf(System.identityHashCode(this)),
                        "服务人员做馆内的服务工作"
                )
        );
    }

}
