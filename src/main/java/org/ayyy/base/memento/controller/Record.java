package org.ayyy.base.memento.controller;
import org.ayyy.base.memento.entity.Activity;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * 对活动实体的操作控制
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/9 15:58]
 */
public class Record {

    public Activity activity=new Activity("2022-12-10","2022-12-11","12","举办藏品展览");
    /**
     *创建一个活动的记录
     */
    public void MakeRecord() {
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                "MakeRecord",
                String.valueOf(System.identityHashCode(this)),
                "活动结束，记录活动内容"
        ));
    }

    /**
     *恢复一个活动的记录
     */
    public void SeeLastActivity() {
        CallStackLogger.log(new CallStackLogInfo(
                getClass().getName(),
                "seeLastActivity",
                String.valueOf(System.identityHashCode(this)),
                "恢复这个活动"
        ));
    }

}
