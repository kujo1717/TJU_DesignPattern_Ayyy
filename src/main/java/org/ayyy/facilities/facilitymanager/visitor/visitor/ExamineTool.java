package org.ayyy.facilities.facilitymanager.visitor.visitor;

import org.ayyy.facilities.facilitymanager.visitor.element.FacilitySystem;
import org.ayyy.facilities.facilitymanager.visitor.element.PowerPart;
import org.ayyy.facilities.facilitymanager.visitor.element.TemperaturePart;
import org.ayyy.facilities.facilitymanager.visitor.element.UsagePart;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:访问者：检测工具
 */
public class ExamineTool implements AbstractVisitor {
    @Override
    public void visit(FacilitySystem facility) {
        System.out.println("检查设备");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExamineTool",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备"
                )
        );
    }

    @Override
    public void visit(TemperaturePart facilityTemperature) {
        System.out.println("检查设备温度");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExamineTool",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备温度"
                )
        );
    }

    @Override
    public void visit(PowerPart facilityPower) {
        System.out.println("检查设备电量");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExamineTool",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备电量"
                )
        );
    }

    @Override
    public void visit(UsagePart facilityUsage) {
        System.out.println("检查设备使用情况");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExamineTool",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备使用情况"
                )
        );
    }
}
