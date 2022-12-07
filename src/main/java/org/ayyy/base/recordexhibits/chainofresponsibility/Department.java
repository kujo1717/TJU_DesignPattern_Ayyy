package org.ayyy.base.recordexhibits.chainofresponsibility;

import lombok.Data;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
@Data
public abstract class Department {
    // 部门名称
    protected String departmentName;
    // 下一个处理申请的部门
    Department nextDepartment;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public abstract void processApplication(RecordApplication recordApplication);
}
