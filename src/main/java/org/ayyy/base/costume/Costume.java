/**
 * Copyright (C), 2022-12-09
 * FileName: Costume
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 建造者模式
 */

package org.ayyy.base.costume;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;


public class Costume {
    private final String kind;
    private final String decoration;

    public Costume(String kind, String decoration) {
        this.kind = kind;
        this.decoration = decoration;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Costume",
                        "Costume",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("选择%s装搭配%s",this.kind, this.decoration)
                )
        );
    }

    public void picture() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Smoothie",
                        "picture",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("拍照留念时所穿的套装为%s装搭配%s",this.kind, this.decoration)
                )
        );
    }

}
