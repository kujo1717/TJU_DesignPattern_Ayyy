package org.ayyy.base.memento.entity;

import lombok.Data;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 活动的实体，具有开始时间、结束时间、内存、id四个属性
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/9 15:57]
 */
@Data
public class Activity {
    /**
     *
     */
    protected String startTime;

    /**
     *
     */
    protected String endTime;

    /**
     *
     */
    protected String content;

    /**
     *
     */
    protected String activityId;
    public Activity(String startTime,String endTime,String activityId,String content){
        setActivityId(activityId);
        setContent(content);
        setEndTime(endTime);
        setStartTime(startTime);
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                "Activity",
                String.valueOf(System.identityHashCode(this)),
                "创建了一个活动"
        ));
    }
}
