package org.ayyy.event.recruitment.factory.interviewers;

import org.ayyy.event.recruitment.factory.workers.ServiceStaff;
import org.ayyy.event.recruitment.factory.workers.Worker;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:45
 * @Description: TODO
 * @Version: 1.0
 **/
public class ServiceStaffInterviewer implements Interviewer {

    /**
     * Default constructor
     */
    public ServiceStaffInterviewer() {
    }

    /**
     * @return
     */
    public Worker RecruitWorker() {
        // 招募一个服务人员
        ServiceStaff serviceStaff = new ServiceStaff();
        return serviceStaff;
    }

}
