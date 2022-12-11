/**
 * Copyright (C), 2022-12-09
 * FileName: CostumeBuilder
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 抽象套装建造器类
 */
package org.ayyy.base.costume;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public abstract class CostumeBuilder {
    protected String kind;
    protected String decoration;

    public abstract void setKind();

    public abstract void setDecoration();

    public Costume build() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AbstractCostumeBuilder",
                        "build",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("以外袍为%s，装饰为%s，搭配套装",this.kind, this.decoration)
                )
        );
        return new Costume(kind, decoration);
    }

}
