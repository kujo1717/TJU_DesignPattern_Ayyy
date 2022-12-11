package org.ayyy.event.donate.facade;

import org.ayyy.event.donate.facade.subsystem.Appraiser;
import org.ayyy.event.donate.facade.subsystem.Editor;
import org.ayyy.event.donate.facade.subsystem.Restorer;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/8 15:53
 * @Description: TODO
 * @Version: 1.0
 **/
public class DonationManager {
    /**
     *
     */
    private Appraiser appraiser;

    /**
     *
     */
    private Restorer restorer;

    /**
     *
     */
    private Editor editor;

    /**
     *
     */
    public DonationManager() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "DonationManager",
                        "DonationManager",
                        String.valueOf(System.identityHashCode(this)),
                        "申请一位捐赠负责人提供服务"
                )
        );
        appraiser = new Appraiser();
        restorer = new Restorer();
        editor = new Editor();
    }

    /**
     * @return
     */
    public void MakeDonation() {
        // 文物评估
        appraiser.appraise();
        //文物修复
        restorer.restore();
        //文物收编
        editor.edit();
    }
}
