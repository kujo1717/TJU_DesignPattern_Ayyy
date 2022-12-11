/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 原型模式
 */
package org.ayyy.base.exhibitionroom;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class ExhibitionRoom implements Cloneable{
    private String name;
    public ExhibitionRoom(String name){this.name = name;}

    public void setName(String name){this.name = name;}

    public void getName(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExhibitionRoom",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "这块展区是"+this.name
                )
        );
    }

    @Override
    public ExhibitionRoom clone(){
        try{
            return (ExhibitionRoom)super.clone();
        }catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
