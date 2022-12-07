package org.ayyy.mediator;

import org.ayyy.base.security.Security;
import org.junit.jupiter.api.Test;

public class MediatorTest {
    @Test
    void test(){
        Security Zhang=new Security("张三","大门");
        Security Li=new Security("李四","大厅");
        Zhang.sendMessage("大门情况正常");
        Li.sendMessage("大厅有可疑人员");
        System.out.println("加入新的安保人员");
        Security Wang=new Security("王五","一号展馆");
        Wang.sendMessage("有游客对展品进行拍照，已经进行口头教育");

    }
}
