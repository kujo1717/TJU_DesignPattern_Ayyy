package org.ayyy.base.recordexhibits.chainofresponsibility;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
// 市级部门，处理三级藏品档案
public class MunicipalDepartment extends Department {
    public MunicipalDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public void processApplication(RecordApplication recordApplication) {
        if (recordApplication.getRecordLevel() == 3) {
            System.out.println("申请编号:" + recordApplication.getApplicationId() + " 档案级别:" + recordApplication.getRecordLevel() + " 被" + this.getDepartmentName() + "审批");
        }
        else{
            if(this.nextDepartment != null){
                this.nextDepartment.processApplication(recordApplication);
            }
            else{
                System.out.println("输入有误，档案没有被成功审批");
            }
        }
    }
}
