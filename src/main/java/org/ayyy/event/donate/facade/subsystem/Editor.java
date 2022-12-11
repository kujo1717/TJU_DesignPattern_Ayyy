package org.ayyy.event.donate.facade.subsystem;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 15:56
 * @Description: TODO
 * @Version: 1.0
 **/
public class Editor {
    /**
     * Default constructor
     */
    public Editor() {
    }

    /**
     * @return
     */
    public void edit() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Editor",
                        "edit",
                        String.valueOf(System.identityHashCode(this)),
                        "让编辑员完成文物收编工作"
                )
        );

    }
}
