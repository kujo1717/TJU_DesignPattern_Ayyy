package org.ayyy.memento;

import org.ayyy.base.memento.controller.Record;
import org.junit.jupiter.api.Test;

/**
 * 测试备忘录模式
 *
 * @author : 叶登旭
 * @version : [v1.0]
 * @createTime : [2022/12/10 10:09]
 */
public class MementoTest {
    @Test
    void test(){
        Record record = new Record();
        record.MakeRecord();
        record.SeeLastActivity();
    }
}
