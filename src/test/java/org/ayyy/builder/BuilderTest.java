/**
 * Copyright (C), 2022-12-09
 * FileName: Costume
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 建造者模式测试
 */
package org.ayyy.builder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.costume.*;

class BuilderTest {

    @BeforeEach
    void start(){
        System.out.println("建造者模式测试开始...");
    }

    @Test
    void testBuilder() {
        CostumeDirector costumeDirector = new CostumeDirector();

        CostumeBuilder tangSwordCostumeBuilder = new TangSwordCostumeBuilder();
        costumeDirector.setCostumeBuilder(tangSwordCostumeBuilder);
        costumeDirector.construct();
        Costume bigAppleSmoothie = tangSwordCostumeBuilder.build();
        bigAppleSmoothie.picture();

        CostumeBuilder hanBookCostumeBuilder = new HanBookCostumeBuilder();
        costumeDirector.setCostumeBuilder(hanBookCostumeBuilder);
        costumeDirector.construct();
        Costume smallLemonSmoothie = hanBookCostumeBuilder.build();
        smallLemonSmoothie.picture();

    }

    @AfterEach
    void end(){
        System.out.println("建造者模式测试结束！");
    }
}