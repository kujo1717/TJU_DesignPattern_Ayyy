package org.ayyy.facilities.facilitymanager.visitor.element;

import org.ayyy.facilities.facilitymanager.visitor.visitor.AbstractVisitor;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:被访问者：使用情况系统
 */
public class UsagePart implements IFacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(AbstractVisitor facilityPartVisitor) {
        facilityPartVisitor.visit(this);
    }
}
