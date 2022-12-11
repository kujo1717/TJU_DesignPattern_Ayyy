/**
 * Copyright (C), 2022-12-07
 * FileName: ExportingProcess
 * Author:   Lv
 * Date:     2022/12/7 23:59
 * Description: 租借使用过程
 */
package org.ayyy.base.vr.objectpool;

public class ExportingProcess {
    private long processNo;

    public ExportingProcess(long processNo) {
        this.processNo = processNo;
        System.out.println("编号为" + processNo + "的VR设备处在空闲状态");
    }

    public long getProcessNo() {
        return processNo;
    }
}
