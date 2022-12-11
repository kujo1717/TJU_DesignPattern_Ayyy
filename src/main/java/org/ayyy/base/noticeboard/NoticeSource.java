/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 黑板模式
 */
package org.ayyy.base.noticeboard;

/**
 * @author aodethri
 *
 * 消息源类
 */
public class NoticeSource {

    /**
     * 消息源所携带的消息
     */
    private String message;

    /**
     * 通知栏实体
     */
    Blackboard blackboard;

    public NoticeSource(String message, Blackboard blackboard){
        this.message = message;
        this.blackboard = blackboard;
    }

    /**
     * 在通知栏上写下通知
     */
    public void updateBlackboard(){
        blackboard.update(message);
    }
}
