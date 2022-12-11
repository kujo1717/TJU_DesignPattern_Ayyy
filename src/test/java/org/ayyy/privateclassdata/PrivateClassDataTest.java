/**
 * Copyright (C), 2022-12-09
 * FileName: ImmutableData
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 私有类数据模式测试
 */
package org.ayyy.privateclassdata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.check.*;

public class PrivateClassDataTest {
    @BeforeEach
    void start(){
        System.out.println("私有类数据模式测试开始...");
    }
    @Test
    void testPrivateClassDataTest() {
        ImmutableData immutableData = new ImmutableData();
        immutableData.run();
    }
    @AfterEach
    void end(){
        System.out.println("私有类数据模式测试结束！");
    }
}
