package org.ayyy.facilities.lecturehall.template.lectures;

import org.ayyy.facilities.lecturehall.template.LectureTemplate;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/7:04 PM
 * @Description: 中国历史讲座
 */
public class ChineseHistoryLecture extends LectureTemplate {
    @Override
    public void address() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ChineseHistoryLecture",
                        "address",
                        String.valueOf(System.identityHashCode(this)),
                        "正在进行《中国历史系列讲座》的演讲!"
                )
        );
    }
}
