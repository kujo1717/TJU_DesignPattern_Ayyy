/**
 * Copyright (C), 2022-12-09
 * FileName: Costume
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 原型模式测试
 */
package org.ayyy.prototype;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.exhibitionroom.ExhibitionRoom;

public class PrototypeTest {
    @BeforeEach
    void start(){
        System.out.println("原型模式测试开始...");
    }

    @Test
    void testPrototype() {
        ExhibitionRoom original = new ExhibitionRoom("普通展区");

        ExhibitionRoom songArea = original.clone();
        songArea.setName("宋瓷专用展区");

        ExhibitionRoom tangArea = original.clone();
        tangArea.setName("唐三彩专用展区");


        original.getName();
        songArea.getName();
        tangArea.getName();

    }

    @AfterEach
    void end(){
        System.out.println("原型模式测试结束！");
    }
}
