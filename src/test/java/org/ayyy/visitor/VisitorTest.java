package org.ayyy.visitor;

import org.ayyy.facilities.facilitymanager.visitor.element.FacilitySystem;
import org.ayyy.facilities.facilitymanager.visitor.visitor.ExamineTool;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/04
 * @Description: 访问者模式测试
 */
public class VisitorTest {
    @BeforeEach
    void setUp(){
        System.out.println("VisitorTest up");
    }

    @Test
    public void testVisitor() {
        FacilitySystem facility = new FacilitySystem();
        ExamineTool examineTool = new ExamineTool();

        facility.accept(examineTool);
    }

    @AfterEach
    void end(){
        System.out.println("VisitorTest done");
    }
}
