package org.ayyy.facilities.lecturehall.template;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/6:59 PM
 * @Description:博物馆讲座的模板
 * 模板方法模式
 */
public abstract class LectureTemplate {
    /**
     * 完成讲座开始前的准备工作，如检查设施、主讲人到场
     */
    public void initialize(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LectureTemplate",
                        "initialize",
                        String.valueOf(System.identityHashCode(this)),
                        "讲座开始前检查设备、主讲人到场"
                )
        );
    }
    /**
     * 允许听众进入讲座大厅
     */
    public void checkIn(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LectureTemplate",
                        "checkIn",
                        String.valueOf(System.identityHashCode(this)),
                        "允许游客进入讲座大厅"
                )
        );
    }
    /**
     * 开始讲座
     */
    public void startLecture(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LectureTemplate",
                        "startLecture",
                        String.valueOf(System.identityHashCode(this)),
                        "讲座开始"
                )
        );
    }
    /**
     * 主讲人演讲
     */
    public abstract void address();
    /**
     * 讲座结束
     */
    public void endLecture(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LectureTemplate",
                        "endLecture",
                        String.valueOf(System.identityHashCode(this)),
                        "讲座结束"
                )
        );
    }
    /**
     * 听众散场，进行散场后的清理和检查
     */
    public void cleanUp(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LectureTemplate",
                        "cleanUp",
                        String.valueOf(System.identityHashCode(this)),
                        "听众散场后的清理工作"
                )
        );
    }

    
    public final void addressLecture() {
        initialize();
        checkIn();
        startLecture();
        address();
        endLecture();
        cleanUp();
    }
}
