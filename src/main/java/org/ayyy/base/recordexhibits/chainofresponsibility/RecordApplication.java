package org.ayyy.base.recordexhibits.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
@Data
@AllArgsConstructor
public class RecordApplication {
    // 申请Id
    private int applicationId;
    // 藏品档案的等级
    private int recordLevel;
}
