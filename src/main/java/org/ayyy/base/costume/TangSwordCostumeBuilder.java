/**
 * Copyright (C), 2022-12-09
 * FileName: TangSwordCostumeBuilder
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 唐代将军套装
 */
package org.ayyy.base.costume;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;


public class TangSwordCostumeBuilder extends CostumeBuilder {


    @Override
    public void setKind() {
        this.kind = "唐代将军";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "TangSwordCostumeBuilder",
                        "setKind",
                        String.valueOf(System.identityHashCode(this)),
                        "设置外套为唐代将军装"
                )
        );
    }

    @Override
    public void setDecoration() {
        this.decoration = "刀剑";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "TangSwordCostumeBuilder",
                        "setDecoration",
                        String.valueOf(System.identityHashCode(this)),
                        "设置外套的配饰为刀剑"
                )
        );
    }
}
