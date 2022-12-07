package org.ayyy.facilities.lecturehall.template.lectures;

import org.ayyy.facilities.lecturehall.template.LectureTemplate;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/7:05 PM
 * @Description:香港文化讲座
 */
public class HongkongCultureLecture extends LectureTemplate {

    @Override
    public void address() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "HongkongCultureLecture",
                        "address",
                        String.valueOf(System.identityHashCode(this)),
                        "正在进行《香港文化系列讲座》的演讲!"
                )
        );
    }
}
