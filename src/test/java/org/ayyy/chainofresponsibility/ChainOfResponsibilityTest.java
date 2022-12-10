package org.ayyy.chainofresponsibility;

import org.ayyy.base.recordexhibits.chainofresponsibility.MunicipalDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.NationalDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.ProvincialDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.RecordApplication;
import org.ayyy.base.showcase.bridge.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class ChainOfResponsibilityTest {
    @Test
    void test(){
        System.out.println("责任链模式测试开始...");
        // 创建一个一级藏品档案审批请求，编号为1111
        RecordApplication recordApplication = new RecordApplication(1111, 1);
        // 创建一个二级藏品档案审批请求，编号为2222
        RecordApplication recordApplication1 = new RecordApplication(2222, 2);
        // 创建一个三级藏品档案审批请求，编号为3333
        RecordApplication recordApplication2 = new RecordApplication(3333, 3);

        // 创建申请列表
        ArrayList<RecordApplication> recordApplications = new ArrayList<RecordApplication>();
        recordApplications.add(recordApplication);
        recordApplications.add(recordApplication1);
        recordApplications.add(recordApplication2);

        // 创建审批部门
        NationalDepartment nationalDepartment = new NationalDepartment("国家级部门");
        ProvincialDepartment provincialDepartment = new ProvincialDepartment("省级部门");
        MunicipalDepartment municipalDepartment = new MunicipalDepartment("市级部门");

        // 创建审批流程（责任链）
        municipalDepartment.setNextDepartment(provincialDepartment);
        provincialDepartment.setNextDepartment(nationalDepartment);

        // 开始处理申请
        for (RecordApplication ra: recordApplications) {
            // 从市级部门开始审批
            municipalDepartment.processApplication(ra);
        }
    }
}
