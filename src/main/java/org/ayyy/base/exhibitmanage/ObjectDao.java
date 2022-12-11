/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 原型模式操作接口类
 */
package org.ayyy.base.exhibitmanage;

import java.util.List;


public interface ObjectDao {
    public List<Object> getAllObjects();
    public Object getObject(int id);
    public void updateObject(int id, int years);
    public void deleteObject(int id);
    public int addObject(String name, int years);
}
