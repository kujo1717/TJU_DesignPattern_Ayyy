package org.ayyy.factory;

import org.ayyy.event.donate.facade.DonationManager;
import org.ayyy.event.recruitment.factory.interviewers.Interviewer;
import org.ayyy.event.recruitment.factory.interviewers.ServiceStaffInterviewer;
import org.ayyy.event.recruitment.factory.interviewers.TechnicalStaffInterviewer;
import org.ayyy.event.recruitment.factory.workers.Worker;
import org.junit.jupiter.api.Test;
/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:59
 * @Description: TODO
 * @Version: 1.0
 **/
public class factoryTest {
    @Test
    void test(){
        Interviewer interviewer1, interviewer2;
        Worker worker1, worker2;

        //招募一个服务人员
        interviewer1 = new ServiceStaffInterviewer();
        worker1 = interviewer1.RecruitWorker();
        worker1.work();

        //招募一个技术人员
        interviewer2 = new TechnicalStaffInterviewer();
        worker2 = interviewer2.RecruitWorker();
        worker2.work();

    }
}
