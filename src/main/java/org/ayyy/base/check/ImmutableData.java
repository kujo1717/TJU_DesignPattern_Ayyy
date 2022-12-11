/**
 * Copyright (C), 2022-12-09
 * FileName: ImmutableData
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 私有类数据模式测试
 */
package org.ayyy.base.check;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

import java.util.Date;

public class ImmutableData {

    public void run(){
        CheckData checkData = new CheckData("宋代皮影打卡点", 96, new Date(), "Mr.Liu");

        String msg = "打卡点为:" + checkData.getCheckName() + ","
                + "打卡积分为:" + checkData.getScore() + ","
                + "打卡时间为:" + checkData.getCreatedTime() + ","
                + "打卡人姓名为:" + checkData.getCreatorName() + "。";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ImmutableData",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}