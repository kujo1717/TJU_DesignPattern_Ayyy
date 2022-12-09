/**
 * Copyright (C), 2022-12-08
 * FileName: ExportingTask
 * Author:   Lv
 * Date:     2022/12/8 0:01
 * Description: VR设备租借任务
 */
package org.ayyy.base.vr.objectpool;

public class ExportingTask implements Runnable {
    private VRDevice<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(VRDevice<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("使用情况" + threadNo + ": 编号为 "
                + exportingProcess.getProcessNo() + " 的VR设备正在使用");

        // return ExportingProcess instance back to the pool
        pool.returnObject(exportingProcess);

        System.out.println("使用情况" + threadNo + ": 编号为 "
                + exportingProcess.getProcessNo() + " 的VR设备已经归还");
    }
}
