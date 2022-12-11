package org.ayyy.event.recruitment.factory.interviewers;

import org.ayyy.event.recruitment.factory.workers.TechnicalStaff;
import org.ayyy.event.recruitment.factory.workers.Worker;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:49
 * @Description: TODO
 * @Version: 1.0
 **/
public class TechnicalStaffInterviewer implements Interviewer{
    /**
     * Default constructor
     */
    public TechnicalStaffInterviewer() {
    }

    /**
     * @return
     */
    public Worker RecruitWorker() {
        // 招募一个技术人员
        TechnicalStaff technicalStaff = new TechnicalStaff();
        return technicalStaff;
    }
}
