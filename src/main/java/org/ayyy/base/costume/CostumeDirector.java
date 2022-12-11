/**
 * Copyright (C), 2022-12-09
 * FileName: CostumeBuilder
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 指建造套装制作的类
 */
package org.ayyy.base.costume;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;


public class CostumeDirector {
    private CostumeBuilder costumeBuilder;

    public void setCostumeBuilder(CostumeBuilder costumeBuilder) {
        this.costumeBuilder = costumeBuilder;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CostumeDirector",
                        "CostumeDirector",
                        String.valueOf(System.identityHashCode(this)),
                        "设置特定建造者"
                )
        );
    }

    public void construct() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CostumeDirector",
                        "construct",
                        String.valueOf(System.identityHashCode(this)),
                        "指导套装的建造"
                )
        );
        costumeBuilder.setKind();
        costumeBuilder.setDecoration();
    }
}