/**
 * Copyright (C), 2022-12-07
 * FileName: Museum
 * Author:   Lv
 * Date:     2022/12/7 20:57
 * Description: 在该类中实现了博物馆的唯一实例
 */
package org.ayyy.base.museum.singleton;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public enum  Museum {
    INSTANCE;
    public static Museum getInstance(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Museum",
                        "getInstance",
                        String.valueOf(System.identityHashCode(INSTANCE)),
                        "获取博物馆这一单例"
                )
        );
        return INSTANCE;
    }
}
