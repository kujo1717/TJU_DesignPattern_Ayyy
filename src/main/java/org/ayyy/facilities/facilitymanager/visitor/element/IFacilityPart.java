package org.ayyy.facilities.facilitymanager.visitor.element;

import org.ayyy.facilities.facilitymanager.visitor.visitor.AbstractVisitor;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:被访问者的抽象接口
 */
public interface IFacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    public void accept(AbstractVisitor facilityPartVisitor);
}
