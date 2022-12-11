/**
 * Copyright (C), 2022-12-09
 * FileName: HanBookCostumeBuilder
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 汉代书生套装
 */
package org.ayyy.base.costume;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class HanBookCostumeBuilder extends CostumeBuilder {

    @Override
    public void setKind() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "HanBookCostumeBuilder",
                        "setKind",
                        String.valueOf(System.identityHashCode(this)),
                        "设置外套为汉代书生装"
                )
        );
        this.kind = "汉代书生";
    }

    @Override
    public void setDecoration() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "HanBookCostumeBuilder",
                        "setDecoration",
                        String.valueOf(System.identityHashCode(this)),
                        "设置外套的配饰为竹简"
                )
        );
        this.decoration = "竹简";
    }
}
