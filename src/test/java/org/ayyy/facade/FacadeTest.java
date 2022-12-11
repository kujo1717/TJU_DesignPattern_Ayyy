package org.ayyy.facade;

import org.ayyy.event.donate.facade.DonationManager;
import org.junit.jupiter.api.Test;
/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 16:01
 * @Description: TODO
 * @Version: 1.0
 **/
public class FacadeTest {
    @Test
    void test(){
        //申请一个捐赠负责人
        DonationManager donationManager = new DonationManager();
        //让捐赠管理人完成捐赠工作
        donationManager.MakeDonation();
    }
}
