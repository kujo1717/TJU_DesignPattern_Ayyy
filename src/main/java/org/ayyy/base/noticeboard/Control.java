/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 黑板模式
 */
package org.ayyy.base.noticeboard;

import java.util.ArrayList;

/**
 * @author aodethri
 *
 * 控制类
 */
public class Control {

    /**
     * 消息源数组
     */
    ArrayList<NoticeSource> noticeSources;

    /**
     * 公告栏实体
     */
    Blackboard blackboard;

    public Control(Blackboard blackboard){
        this.noticeSources = new ArrayList<>();
        this.blackboard = blackboard;
    }

    /**
     * 所有公告源逐个向公告栏添加公告
     * 添加完毕后清空公告源
     */
    public void loop(){
        for(NoticeSource source : noticeSources){
            source.updateBlackboard();
        }
        this.noticeSources = new ArrayList<>();
    }

    public void addSource(String message){
        this.noticeSources.add(
                new NoticeSource(message, blackboard)
        );
    }
}
