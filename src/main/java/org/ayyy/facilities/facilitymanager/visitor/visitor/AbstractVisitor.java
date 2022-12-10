package org.ayyy.facilities.facilitymanager.visitor.visitor;

import org.ayyy.facilities.facilitymanager.visitor.element.FacilitySystem;
import org.ayyy.facilities.facilitymanager.visitor.element.PowerPart;
import org.ayyy.facilities.facilitymanager.visitor.element.TemperaturePart;
import org.ayyy.facilities.facilitymanager.visitor.element.UsagePart;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:抽象访问者
 */
public interface AbstractVisitor {
    public void visit(TemperaturePart facilityTemperature);

    public void visit(PowerPart facilityPower);

    public void visit(UsagePart facilityUsage);

    public void visit(FacilitySystem facility);
}
