package org.ayyy.base.memento.controller;
import org.ayyy.base.memento.entity.Activity;

/**
 * 对活动实体的操作控制
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/9 15:58]
 */
public class Record {

    public Activity activity=new Activity();
    /**
     *创建一个活动的记录
     */
    public void MakeRecord(String startTime,String endTime,String activityId,String content) {
        activity.setActivityId(activityId);
        activity.setContent(content);
        activity.setEndTime(endTime);
        activity.setStartTime(startTime);
    }

    /**
     *恢复一个活动的记录
     */
    public void SeeLastActivity() {
        System.out.println("[恢复"+activity.getStartTime()+"开始的活动]");
    }

    public static void main(String[] args) {
        Record record=new Record();
        record.MakeRecord("2020-12-12","2020-12-13","12","测试");
        record.SeeLastActivity();
    }
}
