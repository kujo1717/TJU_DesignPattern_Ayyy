/**
 * Copyright (C), 2022-12-08
 * FileName: ObjectPoolTest
 * Author:   Lv
 * Date:     2022/12/8 0:04
 * Description: 对象池模式测试
 */
package org.ayyy.objectpool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.ayyy.base.vr.objectpool.VRDevice;
import org.ayyy.base.vr.objectpool.ExportingProcess;
import org.ayyy.base.vr.objectpool.ExportingTask;

public class ObjectPoolTest {

    @BeforeEach
    void start(){
        System.out.println("对象池模式测试开始...");
    }


    private VRDevice<ExportingProcess> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public void setUp() {
        pool = new VRDevice<ExportingProcess>(4, 10, 5) {
            protected ExportingProcess createObject() {
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testVRServicePool() {
        ExecutorService excutor = Executors.newFixedThreadPool(4);

        excutor.execute(new ExportingTask(pool, 1));
        excutor.execute(new ExportingTask(pool, 2));
        excutor.execute(new ExportingTask(pool, 3));
        excutor.execute(new ExportingTask(pool, 4));
//        excutor.execute(new ExportingTask(pool, 5));
//        excutor.execute(new ExportingTask(pool, 6));
//        excutor.execute(new ExportingTask(pool, 7));
//        excutor.execute(new ExportingTask(pool, 8));

        excutor.shutdown();
        try {
            excutor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void VRServicePoolTest() {

        ObjectPoolTest op = new ObjectPoolTest();
        op.setUp();
        op.tearDown();
        op.testVRServicePool();
    }

    @AfterEach
    void end(){
        System.out.println("对象池模式测试结束！");
    }

}
