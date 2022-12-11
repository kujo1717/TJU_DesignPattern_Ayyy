/**
 * Copyright (C), 2022-12-09
 * FileName: Costume
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 数据访问对象模式测试
 */
package org.ayyy.dataaccessobject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.exhibitmanage.*;

class DataAccessObjectTest {
    @BeforeEach
    void start(){
        System.out.println("数据访问对象模式测试开始...");
    }
    @Test
    void testDataAccessObject(){
        ObjectDaoImpl objectDao = new ObjectDaoImpl();
        int ciel_id = objectDao.addObject("宋代南洋白瓷", 1200);
        assert (objectDao.getAllObjects().size() == 1);
        assert (objectDao.getObject(ciel_id) != null);
        objectDao.updateObject(ciel_id, 1240);
        assert (objectDao.getObject(ciel_id).getYears() == 1240);
        objectDao.deleteObject(ciel_id);
        assert (objectDao.getObject(ciel_id) == null);
        assert (objectDao.getAllObjects().size() == 0);
    }
    @AfterEach
    void end(){
        System.out.println("数据访问对象模式测试结束！");
    }
}