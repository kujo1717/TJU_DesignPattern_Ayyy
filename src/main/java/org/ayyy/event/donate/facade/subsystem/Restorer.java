package org.ayyy.event.donate.facade.subsystem;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 15:56
 * @Description: TODO
 * @Version: 1.0
 **/
public class Restorer {
    /**
     * Default constructor
     */
    public Restorer() {
    }

    /**
     * @return
     */
    public void restore() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Restorer",
                        "restore",
                        String.valueOf(System.identityHashCode(this)),
                        "让修复员完成文物修复工作"
                )
        );
    }
}
