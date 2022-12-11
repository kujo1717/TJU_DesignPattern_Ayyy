/**
 * Copyright (C), 2022-12-09
 * FileName: CheckData
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 私有类数据模式测试
 */
package org.ayyy.base.check;

import java.util.Date;

public class CheckData {

    private String checkName;

    private int score;

    private Date createdTime;

    private String creatorName;

    public CheckData(String checkName, int score, Date createdTime,String creatorName){
        this.checkName = checkName;
        this.score = score;
        this.createdTime = createdTime;
        this.creatorName = creatorName;
    }

    public String getCheckName(){
        return checkName;
    }

    public double getScore(){
        return score;
    }

    public Date getCreatedTime(){
        return createdTime;
    }

    public String getCreatorName(){
        return creatorName;
    }
}
