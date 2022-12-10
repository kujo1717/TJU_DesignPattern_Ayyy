package org.ayyy.facilities.facilitymanager.visitor.element;

import org.ayyy.facilities.facilitymanager.visitor.visitor.AbstractVisitor;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:基础设施实体类
 */
public class FacilitySystem implements IFacilityPart{
    IFacilityPart[] parts;

    public FacilitySystem() {
        parts = new IFacilityPart[]{new TemperaturePart(), new PowerPart(), new UsagePart()};
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilitySystem",
                        "FacilitySystem",
                        String.valueOf(System.identityHashCode(this)),
                        "初始化博物馆基础设施，包括内容：设施温度、电量、使用情况"
                )
        );
    }

    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(AbstractVisitor facilityPartVisitor) {
        for (int i = 0; i < parts.length; ++i) {
            parts[i].accept(facilityPartVisitor);
        }
        facilityPartVisitor.visit(this);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilitySystem",
                        "accept",
                        String.valueOf(System.identityHashCode(this)),
                        "分别接受visitor（检查者）对温度、电量、使用情况以及设施的检查"
                )
        );
    }
}
