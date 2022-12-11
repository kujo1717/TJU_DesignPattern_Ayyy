/**
 * Copyright (C), 2022-12-07
 * FileName: SingletonTest
 * Author:   Lv
 * Date:     2022/12/7 21:09
 * Description: 单例模式的测试
 */
package org.ayyy.singleton;

import org.ayyy.base.museum.singleton.Museum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SingletonTest {

    @BeforeEach
    void start(){
        System.out.println("单例模式测试开始...");
    }


    @Test
    void testSingleton(){
        Museum museum1 = Museum.getInstance();
        Museum museum2 = Museum.getInstance();
        assertSame(museum1,museum2);
        System.out.println("博物馆是："+museum1.toString());
    }

    @AfterEach
    void end(){
        System.out.println("单例模式测试结束！");
    }
}
